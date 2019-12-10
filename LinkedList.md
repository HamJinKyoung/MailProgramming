#LinkedList<E>

LinkedList<E>�� List<E> �������̽��� ������ Ŭ�����μ� ��θ��� java.util.LinkedList�̴�.

LinkedList�� ��ҵ��� ��������� �����Ͽ� �����Ѵ�.

add(), get()

LinkedList�� �� �հ� �� �ڸ� ����Ű�� head, tail ���۷����� ������ �־�, �� ���̳� �� ��, �߰��� ����� ������ �����ϸ� �ε����� �̿��Ͽ� ��ҿ� ������ ���� �ִ�.

##�÷����� ���� �˻��� ���� Iterator
Vector, ArrayList, LinkedList, Set�� ���� ��Ұ� ������� ����� �ɷ��ǿ��� ��Ҹ� ���������� �˻��� ���� java.util ��Ű���� Iterator<E> �������̽��� ����ϸ� ���ϴ�.

Iterator<E> �������̽��� �޼ҵ�
- boolean hasNext() : �湮�� ��Ұ� ���� ������ true ����
- E next() : ���� ��� ����
- void remove() : ���������� ���ϵ� ��� ����

##Collections Ŭ���� Ȱ��
java.util ��Ű���� ���Ե� Collections Ŭ����
- sort() : �÷��ǿ� ���Ե� ��ҵ��� ����
- reverse() : ��Ҹ� �ݴ� ������ ����
- max(), min() : ��ҵ��� �ִ񰪰� �ּڰ� ã�Ƴ���
- binarySearch() : ���� �˻�
Collections Ŭ������ �޼ҵ�� ��� static Ÿ���̹Ƿ� Collections ��ü�� ������ �ʿ�x

###Collections Ŭ������ Ȱ���Ͽ� ���ڿ� ����, �ݴ�� ����, ���� �˻��� �����ϴ� ���
	import java.util.*;
	
	public class CollectionsEx {
		static void printList(LinkedList<String> l) {	// ����Ʈ�� ��Ҹ� ��� ����ϴ� �޼ҵ�
			Iterator<String> iterator = l.iterator();	// Iterator ��ü ����
			while(iterator.hasNext()) {	// Iterator ��ü�� ��Ұ� ���� ������ �ݺ�
				String e = iterator.next();	// ���� ��� ����
				String separator;
				if(iterator.hasNext())
					separator = "->";	// ������ ��Ұ� �ƴϸ� -> ���
				else
					separator = "\n";	// ������ ����̸� �ٹٲ�
				System.out.print(e+separator);
			}
		}
	
		public static void main(String[] args) {
			LinkedList<String> myList = new LinkedList<String>();	// �� ����Ʈ ����
			myList.add("a");
			myList.add("b");
			myList.add("c");
			myList.add(0,"d");
			myList.add(2,"e");
			
			Collections.sort(myList);	// ��� ����
			printList(myList);	// ���ĵ� ��� ���
			
			Collections.reverse(myList);	// ����� ������ �ݴ�� ����
			printList(myList);	// ��� ���
			
			int index = Collections.binarySearch(myList, "c")+1;
			System.out.println("c�� " + index + "��° ����Դϴ�.");
		}
	}
	
������

> a->b->c->d->e
>
> e->d->c->b->a
>
> c�� 3��° ����Դϴ�. 