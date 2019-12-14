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
	class Node {
		private Object data;
		private Node next;
		public Node (Object input) {
			this.data = input;
			this.next = null;
		}
	}
	/* Ǯ��
	�� ������ �ΰ��� �����͸� ���� ���� Ǯ���ϴ�. ù��° �����͸� ���� N��ŭ �����ϴ�. �׸��� ù��° �����Ϳ� �ι�° �����͸� ���ÿ� �ϳ��� �����Դϴ�.
	ù��° �������� ���� ��尡 null�� ���� ������ �Ǹ�, �ι�° �������� ���� ���� ������ N��° ��尡 �˴ϴ�. �� ��带 ���� �ѵ� �Ӹ� ��带 �����ϸ� �˴ϴ�.
	�߿��� ���� ���̽���, ù��° ��带 N��° �ű� �� ����� ���� null�̶�� ������ N��° ���� ù��° ��������� ��带 ������Ʈ ���� �������ݴϴ�.
	*/
	
	static Node solution(Node head, int n) {
	    if (head == null) {
	        return null;
	    }
	    Node first = head;
	    Node second = head;
	    for (int i = 0; i < n; i++) {
	        first = first.next;
	    }
	    if (first == null) {
	        head = head.next;
	        return head;
	    }
	    while (first.next != null) {
	        first = first.next;
	        second = second.next;
	    }
	    second.next = second.next.next;
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
		solution(list, n);
	}

}
