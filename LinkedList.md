#LinkedList<E>

LinkedList<E>는 List<E> 인터페이스를 구현한 클래스로서 경로명이 java.util.LinkedList이다.

LinkedList는 요소들을 양방향으로 연결하여 관리한다.

add(), get()

LinkedList는 맨 앞과 맨 뒤를 가리키는 head, tail 레퍼런스를 가지고 있어, 맨 앞이나 맨 뒤, 중간에 요소의 삽입이 가능하며 인덱스를 이용하여 요소에 접근할 수도 있다.

##컬렉션의 순차 검색을 위한 Iterator
Vector, ArrayList, LinkedList, Set과 같이 요소가 순서대로 저장된 걸렉션에서 요소를 순차적으로 검색할 때는 java.util 패키지의 Iterator<E> 인터페이스를 사용하면 편리하다.

Iterator<E> 인터페이스의 메소드
- boolean hasNext() : 방문할 요소가 남아 있으면 true 리턴
- E next() : 다음 요소 리턴
- void remove() : 마지막으로 리턴된 요소 제거

##Collections 클래스 활용
java.util 패키지에 포함된 Collections 클래스
- sort() : 컬렉션에 포함된 요소들의 정렬
- reverse() : 요소를 반대 순으로 정렬
- max(), min() : 요소들의 최댓값과 최솟값 찾아내기
- binarySearch() : 이진 검색
Collections 클래스의 메소드는 모두 static 타입이므로 Collections 객체를 생성할 필요x

###Collections 클래스를 활용하여 문자열 정렬, 반대로 정렬, 이진 검색을 실행하는 사례
	import java.util.*;
	
	public class CollectionsEx {
		static void printList(LinkedList<String> l) {	// 리스트의 요소를 모두 출력하는 메소드
			Iterator<String> iterator = l.iterator();	// Iterator 객체 리턴
			while(iterator.hasNext()) {	// Iterator 객체에 요소가 있을 때까지 반복
				String e = iterator.next();	// 다음 요소 리턴
				String separator;
				if(iterator.hasNext())
					separator = "->";	// 마지막 요소가 아니면 -> 출력
				else
					separator = "\n";	// 마지막 요소이면 줄바꿈
				System.out.print(e+separator);
			}
		}
	
		public static void main(String[] args) {
			LinkedList<String> myList = new LinkedList<String>();	// 빈 리스트 생성
			myList.add("a");
			myList.add("b");
			myList.add("c");
			myList.add(0,"d");
			myList.add(2,"e");
			
			Collections.sort(myList);	// 요소 정렬
			printList(myList);	// 정렬된 요소 출력
			
			Collections.reverse(myList);	// 요소의 순서를 반대로 구성
			printList(myList);	// 요소 출력
			
			int index = Collections.binarySearch(myList, "c")+1;
			System.out.println("c는 " + index + "번째 요소입니다.");
		}
	}
	
실행결과

> a->b->c->d->e
>
> e->d->c->b->a
>
> c는 3번째 요소입니다. 