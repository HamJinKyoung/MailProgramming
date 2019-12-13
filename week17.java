import java.util.LinkedList;
import java.util.Queue;

/*
0�� 1�� ������� 2D ���� �迭�� �ֽ��ϴ�. 0�� ��ֹ��̰� 1�� �����϶�, �� ��ǥ�� �־�����, ù��° ��ǥ���� �ι�° ��ǥ���� ���� ����� �Ÿ��� ���Ͻÿ�.
�� ��ǥ�� ��� ���ο��� ���۵ǰ� ��, ��, �Ʒ�, ���� �����̸� �밢�����δ� ������ �� �����ϴ�. ���� �� �� ���ٸ� -1�� �����Ͻÿ�.
Given a 2D array with 0s and 1s, 0 represents an obstacle and 1 represents a road.
Find the closest distance between two given points. You must only move up down right left. You cannot move through an obstacle.

����)
Input:
{{1, 0, 0, 1, 1, 0},
{1, 0, 0, 1, 0, 0},
{1, 1, 1, 1, 0, 0},
{1, 0, 0, 0, 0, 1},
{1, 1, 1, 1, 1, 1}}
Start: (0, 0)
Finish: (0, 4)
Output: 8
*/

public class week17 {
	/* Ǯ��
	 �� ������ �ʺ�켱 Ž��(Breadth-First Search)�� 2D �迭�� ����ϸ� ���� ����ȭ �ǰ� Ǯ �� �ֽ��ϴ�.
	 �ϴ� ť�� �־��� ���� �迭�� ���� ũ���� ���ο� 2D�迭�� �ʿ��մϴ�. ���ο� �迭�� �̹� ������ �������� üũ�Ϸ��� ���̴� 2D bool �迭�̿��� �˴ϴ�.
	 ť(Queue)�� ����� ��ǥ�� �Ÿ�(0)�� �ְ� ť�� empty �Ҷ� ���� ������ �ݺ��մϴ�.
	1] ť���� ��(��ǥ�� �Ÿ�)�� �ϳ� ������.
	2] ��ǥ�� �������̶��, �Ÿ��� ����. // ��
	3] ��ǥ���� �� �� �ִ� ���ο� ��ǥ���� �����. (��, �Ʒ�, ����, ������)
	4] ���ο� ��ǥ���� �̹� ���� ���� �ƴϸ� ť�� (��ǥ, �Ÿ�+1)�� �־��ְ� bool�迭�� ��ǥ ��ġ ���� true üũ ���ݴϴ�.
	���� ���� ���� �ݺ��� �����ٸ�, �������� �� �� �ִ� ����� ���ٴ� �������� -1�� ���� ���ݴϴ�.
	 */
	static class Point {
	    int x;
	    int y;
	}

	static class Node {
	    Point pt;
	    int dist;
	}
	
	static int Solution(int map[][], Point src, Point dest) {
	    if (map[src.x][src.y] == 0 || map[dest.x][dest.y] == 0) {
	        return -1;
	    }
	    
	    boolean[][] visited =  new boolean[map.length][map[0].length];
	    visited[src.x][src.y] = true;
	    
	    Queue<Node> q = new LinkedList<Node>();
	    Node start = new Node();
	    start.pt = src; start.dist = 0;
	    q.add(start);
	    
	    int rowNeighbor[] = {-1, 0, 0, 1};
	    int colNeighbor[] = {0, -1, 1, 0};
	    
	    while (!q.isEmpty()) {
	        Node curr = q.poll();
	        Point pt = curr.pt;
	        if (pt.x == dest.x && pt.y == dest.y) {
	            return curr.dist;
	        }
	        
	        // ���� ��ǥ���� �� �� �ִ� ��ǥ �߰��ϱ�
	        for (int i = 0; i < rowNeighbor.length; i++) {
	            int row = pt.x + rowNeighbor[i];
	            int col = pt.y + colNeighbor[i];
	            if (row < 0 || col < 0 || row >= map.length || col >= map[0].length) {
	                continue;
	            }
	            if (map[row][col] == 0 || visited[row][col] == true) {
	                continue;
	            }
	            visited[row][col] = true;
	            Node neighbor = new Node();
	            neighbor.pt.x = row; neighbor.pt.y = col; neighbor.dist = curr.dist + 1;
	            q.add(neighbor);
	        }
	    }
	    
	    return -1;
	}

	public static void main(String[] args) {
		int[][] array = {{1, 0, 0, 1, 1, 0},
						{1, 0, 0, 1, 0, 0},
						{1, 1, 1, 1, 0, 0},
						{1, 0, 0, 0, 0, 1},
						{1, 1, 1, 1, 1, 1}};
		
		Point start = new Point();
		start.x = 0; start.y = 0;
		
		Point finish = new Point();
		finish.x = 0; finish.y = 4;
		
		System.out.println(Solution(array, start, finish));
	}

}
