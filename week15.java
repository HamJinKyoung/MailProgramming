import java.util.LinkedList;

/*
��ũ�� ����Ʈ(linked list)�� �Ӹ� ���(head node)�� ���� N�� �־�����, ������ N��° ���(node)�� �����ϰ� �Ӹ� ���(head node)�� �����Ͻÿ�.
��, ����Ʈ�� �ѹ��� ���鼭 Ǯ����մϴ�. N�� ����Ʈ ���̺��� ũ�� �ʽ��ϴ�.

Given a head node of a singly linked list, remove the Nth last element and return the head node.

����)
Input: 1->2->3->4->5, N=2
Output: 1->2->3->5

Input: 1->2->3, N=3
Output: 2->3

Input: 1, N=1
Output: null
*/

public class week15 {
	
	static LinkedList<Integer> Mysolution(LinkedList<Integer> head, int n) {
		// LinkedList ���� ���� �����ϱ�
		// Node..
		
		return head;
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int n = 2;
		Mysolution(list, n);
	}

}
