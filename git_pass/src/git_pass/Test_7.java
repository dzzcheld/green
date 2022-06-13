package git_pass;

interface I2{
	public String A();
}

interface I3{
	public String B();
}

class D implements I2, I3{
	public String A() {
	return "A";
}
	
	public String B() {
		return "B";
	}
}

public class Test_7 {

	public static void main(String[] args) {
	
		D obj=new D();
	
		I2 objI2=new D();
		I3 objI3=new D();
		
		obj.A();
		obj.B();
		
		objI2.A();
		objI3.B();

	}

}

/*
 * D 클래스를 데이터 타입 D로 인스턴스화
 * (D 클래스 필드 사용가능, 메모리 점유)
 * 
 * D 클래스를 데이터 타입 I2, I3 로 인스턴스화
 * (D 클래스 필드 사용가능, 메모리 점유)
 * 
 * obj에서 A(B) 메소드 실행
 * (obj는 데이터 타입이 D 인데, 이는 I2, I3 를 구현한다)
 * "A" 출력(B)
 * 
 * objI2 의 데이터 타입은 I2
 * 
 * =>
 * (인스턴스를 외부에서 제어할 수 있는 조작 장치를 인스턴스 I2의 맴버로 제한
 * 외부에서 I2를 조작 할 수 있다)
 * A 출력
 * 
 * =>
 * 
 * *
 */