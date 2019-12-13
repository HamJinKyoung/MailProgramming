import java.util.LinkedList;
import java.util.Queue;

/*
0과 1로 만들어진 2D 정수 배열이 있습니다. 0은 장애물이고 1은 도로일때, 두 좌표가 주어지면, 첫번째 좌표에서 두번째 좌표까지 가장 가까운 거리를 구하시오.
두 좌표는 모두 도로에서 시작되고 좌, 우, 아래, 위로 움직이며 대각선으로는 움직일 수 없습니다. 만약 갈 수 없다면 -1을 리턴하시오.
Given a 2D array with 0s and 1s, 0 represents an obstacle and 1 represents a road.
Find the closest distance between two given points. You must only move up down right left. You cannot move through an obstacle.

예제)
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
	/* 풀이
	 이 문제는 너비우선 탐색(Breadth-First Search)를 2D 배열에 사용하면 가장 최적화 되게 풀 수 있습니다.
	 일단 큐와 주어진 정수 배열과 같은 크기의 새로운 2D배열이 필요합니다. 새로운 배열은 이미 지나간 곳인지를 체크하려는 용이니 2D bool 배열이여도 됩니다.
	 큐(Queue)에 출발점 좌표와 거리(0)를 넣고 큐가 empty 할때 까지 다음을 반복합니다.
	1] 큐에서 값(좌표와 거리)을 하나 꺼낸다.
	2] 좌표가 도착점이라면, 거리를 리턴. // 끝
	3] 좌표에서 갈 수 있는 새로운 좌표들을 만든다. (위, 아래, 왼쪽, 오른쪽)
	4] 새로운 좌표들중 이미 가본 곳이 아니면 큐에 (좌표, 거리+1)을 넣어주고 bool배열에 좌표 위치 마다 true 체크 해줍니다.
	만약 리턴 없이 반복이 끝났다면, 도착점에 갈 수 있는 방법이 없다는 뜻임으로 -1을 리턴 해줍니다.
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
	        
	        // 현재 좌표에서 갈 수 있는 좌표 추가하기
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
