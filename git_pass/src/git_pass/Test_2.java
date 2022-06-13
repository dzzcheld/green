
/*
package git_pass;

class A{
	public String x() {return "x";}
}

class B extends A{
	public String y() {return "y";}
}

public class Test_2 {

	public static void main(String[] args) {
		
		A obj=new B();
		obj.x();
		obj.y();
	}

}
/*
 * B라는 객체를 생성하여 A 타입의 변수 obj에 저장
 * (메모리 점유, obj변수는 A 의 클래스 필드를 사용 할 수 있다.)
 * 
 * obj에서 x()메소드를 호출
 * 클래스 A에서 "x"가 반환 될 수도 있고(A의 클래스 필드라 이게 작동)
 * 클래스 B에서 상속받았기에, B에서 "x"를 반환 할 수도 있다.
 * 
 * obj 는 A타입인데 A에는 y()메소드가 없기에 출력 불가
 * (obj의 객체 타입이 B라면 가능함)
 * 
 * 클래스 B를 데이터 타입 A로 인스턴스화 하게되어, 
 * 데이터 타입 A에 존재하지 않는 필드는 호출 할 수 없다.
 * *
 */