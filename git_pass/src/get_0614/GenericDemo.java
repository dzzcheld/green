package get_0614;

class Person<T>{
	public T info;
}

public class GenericDemo {

	public static void main(String[] args) {
		
		Person<String>p1=new Person<String>();
		Person<StringBuilder>p2=new Person<StringBuilder>();

	}

}
/*
 * 
 * 제네릭
 * 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법
 * 
 * p1-String
 * p2-StringBuilder
 * 
 * <>
 * 안에 지정된 데이터 타입에 의해서 결정된다.
 * 
 * 
 * 
 * *
 */