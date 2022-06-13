/*

package git_pass;

class A{
	public String x() {return "A.x";}
}

class B extends A{
	public String x() { return "B.X"; }
	public String y() { return "y"; }
}


public class Test_3 {

	public static void main(String[] args) {
		
		A obj=new B();
		System.out.println(obj.x());
		//System.out.println(obj.y());
	}

}

/*
 * B객체를 생성하여 A타입의 obj 라는 변수에 저장한다.
 * obj.x() 메소드 호출, A타입 이기에 A.x 출력
 * 
 * 
 * 클래스 B의 데이터 타입을 클래스 A로 인스턴스화 했을 때 
 * 클래스 B의 메소드 y는 마치 존재하지 않는 것 처럼 실행되지 않았음
 * (클래스 B가 클래스 A화 되었다.)
 * 
 * 
 * 클래스 B의 데이터 타입을 클래스 A로 인스턴스화 했을 때
 * 클래스 B의 메소드 x를 실행하면 클래스 A에서 정의된 메소드가 아니라 
 * 클래스 B에서 정의된 메소드가 실행 되었다.
 * (클래스 B의 기본적인 성질은 그대로 간직하고 있다.)
 * 
 * =>
 * 클래스 B를 A의 데이터 타입으로 인스턴스화 했을 때, 클래스 A에 존재하는 멤버만이 
 * 클래스 B의 멤버가 된다. 동시에 클래스 B에서 오버라이딩한 멤버의 동작방식은 그대로 유지한다. 
 * (y 메소드는 클래스 A의 필드에는 없기에 호출 할 수 없다)
 * 
 * 
 * */
