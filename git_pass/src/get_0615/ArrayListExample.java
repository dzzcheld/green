package get_0615;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DataBase");
		list.add("iBATIS");
		
		int size=list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		String skill=list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str=list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String str=list.get(i);
			System.out.println(i + ":" + str);
		}
		
	}

}

/*
 *ArrayList<String> 타입의 객체를 List 클래스 <String> 타입으로 인스턴화 하여 list에 저장
 *(메모리 점유, List 클래스 패스 사용 가능)
 *
 *list.add() 
 *주어진 객체를 맨 끝에 추가합니다. 
 *
 *list.add(2, "DataBase");
 *지정된 인덱스에 객체 삽입
 *Java, JDBC, DataBase, Servlet/JSP, iBATIS 슌서대로 객체에 저장됨.
 *
 *size()
 *저장되어 있는 전체 객체 수를 리턴한다.
 *
 *get()
 *주어진 인덱스에 저장된 객체를 리턴합니다
 *2번 인덱스에 저장된 객체인 DataBase 를 리턴한다.
 *
 *remove()
 *주어진 인덱스에 저장된 객체를 삭제합니다.
 *2번 인덱스인 DataBase 삭제, 그 다음오르 2번 인덱스로 온 Servlet/JSP 삭제
 *iBATIS 삭제
 *
 *=?
 *Java, JDBC 만 출력된다.
 *
 * =======================================
 * 
 * List 컬렉션
 *
 * 객체를 인덱스로 관리
 * 저장용량이 자동으로 증가하며 객체 저장 시 자동 인덱스가 부여
 * 객체 자체를 저장하는 것 뿐만 아니라 객체번지를 참조하는 것도 가능하다.
 * 객체 제거하는 경우 바로 뒤 인덱스부터 마지막 인덱스까지 모두 앞으로 1씩 당겨짐
 * 
 */
