package get_0614;

class Data<T>{		//	클래스명 옆에 제네릭 기호를 적고 그 안에 매개변수 기술함,
	T obj;			//	인스턴스 변수 obj의 자료형은 T임.
	Data(T ob){		//	생성자 Data는 자료형이 T인 인수 한 개를 입력받음.
		obj=ob;
	}
	T getObj() {	//	인스턴스 변수 obj의 자료형은 T임.
		return obj;
	}
	void showType() {
		System.out.println("Type of T:" + obj.getClass().getName());
	}
}

public class Code229 {

	public static void main(String[] args) {
		
		Data<Integer>d1=new Data<Integer>(100);		//	정수 100 인수
		System.out.println(d1.getObj());
		d1.showType();
		
		Data<String>d2=new Data<String>("JAVA");
		System.out.println(d2.getObj());
		d2.showType();

	}

}
/*매개변수 자리에 어떤 자료형도 넣을 수 있다.
 * <> 기호를 사용하여 어떤 타입의 인수를 넣을지 알려야 함.
 * 기본 자료형을 제네릭으로 사용하고자 한다면 Interger, Double등을 이용
 * 
 * Data객체를 Data 클래스 <Integer>, <String> 타입으로
 * 인스턴스화 객체에 전달, 인스턴스 생성시 100 입력(Data 에 100 전달) 
 * 
 *  d1에서 getObj 호출(인자값 100)
 *  매개변수가 클래스 필드 obj에 저장, getObj는 이를 리턴한다.
 *  
 *  d1에서 showType() 호출
 *  getCalss(), getName() //클래스에 대한 메타속성, 클래스명 확인
 * 
 * 
 * 
 * 제네릭시
 * -매개변수화된 자료형
 * 
 * 
 * *
 */