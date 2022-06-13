package git_pass;

class O {
	
	public void a (int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}
	
	public void a (String param) {
		System.out.println("문자출력");
		System.out.println(param);
	}
	
}

public class Test_1 {

	public static void main(String[] args) {
		
		O o =new O();
		
		o.a(1);
		o.a("one");

	}

}
/*
 * 메인
 * - O라는 객체를 생성하여 O타입인 o라는변수에 저장한다.
 * - o객체에 접근하여 a 라는 메소드 호출, 인자 값은 1 이기에 "숫자출력"이 나온다
 * - o객체에 접근하여 a 라는 메소드 호출, 인자 값은 "one" 이기에 "문자출력"이 나온다
 * 
 *=> 다형성이란 동일한 조작방법으로 동작시키지만 동작방법은 다른 것을 의미한다.
 *	(같은 이름이지만 서로 다른 동작 방법을 가짐, 오버로딩)
 *
 *	객체타입은 해당 객체 필드를 사용할 수 있다.
 *	
 *	메소드와 생성자의 큰 차이는 생성자는 클래스와 이름이 같으며 리턴값이 없고
 *	메소드는 이름이 동일하지 않아도 되며, 리턴값이 존재 한다.
 * 
 * *
 */