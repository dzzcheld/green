package get_0614;

class TwoGenerics<T,V>{
	T data1;
	V data2;
	TwoGenerics(T d1, V d2){
		data1=d1;
		data2=d2;
	}
	void showGenericType() {
		System.out.println("Type of T:" + data1.getClass().getName());
		System.out.println("Type of V:" + data2.getClass().getName());
	}
	T getData1() {return data1;}
	V getData2() {return data2;}
}

public class Code230 {

	public static void main(String[] args) {
	
		TwoGenerics<Integer, String> x=new TwoGenerics<Integer, String>(100,"hello");
		x.showGenericType();
		int y=x.getData1();
		System.out.println("value:" + y);
		String z=x.getData2();
		System.out.println("value: " + z);
	}

}

/*TwoGenerics 라는 클래스는 Integer, String 타입인데 
 * 여기에(x) TwoGenerics 라는 객체를 만들고 인자는 100, "hello"를 넣어(인스턴스화가 생성될 떄 값을 입력함)
 * 
 * x에서 showGenericType(); 메서드 호출
 * 100은 data1에 저장, "hello"는 data2에 저장 후
 * 클래스 메타 속성과 클래스 이름과 함께 반환됨.
 * 
 * x에서(TwoGenerics 필드사용) getData1()를 호출하여 int 타입 변수인 y에 반환
 * 클래스 필드 data1 에는 100, data2에는 "hello"저장
 * T 형인 getData1()를 호출하여, 100을 반환함.
 * 
 * z도 같은 방식이다
 * 
 * 
 * 
 * 
 * 
 * 
 *  
 *  
 *  
 *  
 */
 