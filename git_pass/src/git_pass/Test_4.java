package git_pass;

class A{
	public String x() {	return "A.x"; }
}

class B extends A{
	public String x() { return "B.x"; }
	public String y() { return "y"; }
}

class B2 extends A{
	public String x() {return "B2.x";}
}

public class Test_4 {

	public static void main(String[] args) {
		
		A obj=new B();
		A obj2=new B2();
		
		System.out.println(obj.x());
		System.out.println(obj2.x());
	}

}

/*
 * B(B2)클래스를 데이터 타입 A클래스로 인스턴스화 시켜서 obj 에 저장
 * 클래스 A에 존재하는 멤버만이 클래스 B의 멤버가 된다
 * (데이터 할당, A클래스 필드 사용가능)
 * 
 * obj에서 x 메소드 호출(obj는 클래스 A 필드를 사용 할 수 있다.)
 * A를 상속받은 클래서 B에 x 메소드가 있는 상황, 오버라이딩이라서
 * "B.x" 출력 후 반환
 * 
 * obj2에서 x 메소드 호출(A 클래스 필드 사용가능)
 * "B2.x" 출력 후 반환
 * 
 * 같은 이름의 메소드가 있을 경우 오버라이딩으로 적용됨.
 * 
 * =>
 * 서로 다른 클래스가 동일한 데이터 타입 A로 인스턴스화 되었다.
 * (상속과 오버라이딩 그리고 형변환을 이용한 다형성 이다.)
 * (하위 클래스를 상위 클래스 타입으로 인스턴화 했을 때 일어는 일)
 * 
 * https://opentutorials.org/module/516/6062
 * 참고하기
 * 
 * */
