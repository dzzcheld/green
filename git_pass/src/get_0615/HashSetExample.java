package get_0615;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("JAVA");
		set.add("iBATIS");
		
		int size=set.size();
		System.out.println("총 객체수: " + size);
		
		Iterator<String>iterator=set.iterator();
		while(iterator.hasNext()) {
			String element=iterator.next();
			System.out.println("\t " + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수:" + set.size());
		
		iterator=set.iterator();
		for(String element: set) {
			System.out.println("\t" + element);
		}
		set.clear();
		if(set.isEmpty()) {System.out.println("비어 있음");}

	}

}
/*
 * set 컬렉션
 * -저장 순서 유지되지 않는다
 * -객체 중복하여 저장할 수 없고 하나의 null만 저장 할 수 있다.
 * 
 * <HashSet>
 * =set 인터페이스의 구현 클래스
 * =기본 생성자 호출하여 생성
 *====================================================== 
 *HashSet<String>객체를 Set 클래스<String>타입으로 인스턴스화 시켜서 set 변수에 저장
 *(메모리 할당, Set 클래스 패스 사용가능)
 *
 *set.add를 통해 주어진 객체를 끝에 추가함
 *
 *size()메소드를 int size에 저장한다
 *(5가 저장된다)
 *"총 객체수: 5" 출력
 *
 *set 객체를 iterator를 통헤 읽어와서 Iterator 클래스 <String>타입 변수인 iterator 에 저장한다.
 *(set객체를 읽어와 iterator 에 저장한다.)
 *
 *(반복문)
 *iterator.hashNext()
 *set에서 객체를 가져온다, 객체가 있으면 true 없으면 false
 *객체를 가져와 String 타입 변수 element에 저장한다.
 *set에 저장된 객체들을 출력한다. 총 4개
 *
 *Java, Setvlet만 남음
 *size 2
 *
 *set 요소를 읽어와 iterator 에 저장
 *Java, Setvlet 간격 두고 출력
 *
 *set.clear()로 저장된 객체를 전부 삭제 휴
 *set이 비어있다면 "비어있음 출력"
 *(isEmpty() 비어있는지 조사함
 *
 *
 *========================================================
 *
 *add()
 *주어진 객체를 맨 끝에 추가합니다,
 *
 *size()
 *저장되어 있는 전체 객체 수를 리턴한다
 *
 *set에서 iterator()객체를 읽어오는데 이를 Iterator 클래스 <String> 타입으로 인스턴스화 한다.
 *(메모리 할당, Iterator 클래스 패스 사용)
 *iterator.hashNext()를 통해 읽어서 가져올 객체가 있으면 true, 없으면 false(iterator 인터페이스 메소드)
 *
 *
 *Iterator
 *자바의 컬렉션 프레임워크(List, Set, Map...)에서 컬렉션에 저장디어 잇는 요소들을 읽어오는 방법 중 하나.
 *컬렉션 프레임워크에서 쉽게 값을 가져오고 제거할 수 있음
 *단방향 반복만 가능, 값을 변경 및 추가는 불가하고 대량의 데이터 처리는 느리다
 * 
 * 
 * 
 */
 