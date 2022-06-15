package get_0615;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String>list1=new ArrayList<String>();
		List<String>list2=new ArrayList<String>();
		
		long startTime;
		long endTime;
		
		startTime=System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime=System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + "ns");
		
		endTime=System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime-startTime) + "ns7");
		
	}

}

/*
 * ArrayList<String> 객체를 List 클래스 <String> 타입으로 인스턴스화 후 list1, list2 에 저장
 * (메모리 점유, List의 클래스 필드를 사용 할 수 있다)
 * 
 * long 타입의 변수 startTime, endTime 을 선언한다.
 * 
 * startTime 변수에 시간값을 나노단위로 반환하는 메소드를 저장함
 * list1객체 0번 인덱스에 0~9999까지의 문자열을 저장한다.
 * -System.nanoTime();
 * 현재 JVM의 시간값을 단위로 반환하는 메서드
 * 오직 경과된 시간을 측정하는데 사용, 시스템이나 기각과는 아무련 연관성이 없음을 말함.
 * -String.valueOf()
 * 객체를 String 문자열 참조 자료형으로 형 변환하는 역할을 한다.
 * 전달받은 파라미터가 null일 경우 문자열 "null"을 반환한다.

 *endTime 에 System.nanoTime()메서드를 저장하여 현재 JVM의 시간값을 단위로 반환하고 저장한다.
 *ArrayList 에서 0~9999까지 저장한 시간
 *
 *LinkedList 에서 0~9999까지 저장한 시간
 *
 *=>
 *ArrayList, LinkedList 머두 List인터페이스를 구현한 collection 구현체이다.
 *인터페이스만 같고 내부적으로 동작하는 방식은 다르다.
 *
 *ArrayList
 *-내부적으로 데이터를 배열에서 관리하며 데이터의 추가, 삭제를 위해
 * 아래와 같이 임시 배열응 생성해 데이터를 복사 하는 방법을 사용한다.
 *(복사가 많이 일어나면 성능저하를 일으킬 수 있지만, 각 데이터 검색에는 유리하다)
 *
 *LinkedList
 *-데이터의 추가, 삭제시 불필요한 데이터의 복사가 없어(임시 배열을 생성하지 않음)
 *데이터의 추가, 삭제시에 유리하다.
 *검색시에는 처음부터 노드를 순회해야 하기 때문에 성능상 불리하다.
 *
 *=>
 *get/set은 ArrayList
 *처음이나 끝에 잦은 삽입, 삭제는 LinkedList
 *
 */
