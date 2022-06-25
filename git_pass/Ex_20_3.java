package get_06_25;

class Ex_output_3<T1,T2>{
	private  T1 a;
	private  T2 b;
	
	
	public static <T1,T2> void info(Integer a, String b) {
		for(int i=0; i<a; i++) {
			System.out.print(b+"\t");
		}
	}
	
	
	}
	 
	


public class Ex_20_3 {

	public static void main(String[] args) {
	
		Ex_output_3<Integer, String> result=new Ex_output_3<>();
		Ex_output_3.info(10,"#");
		
	}

}
/*
 * [문제20] output(10,'#')함수를 호출하여 다음과 같이 출력하시오
        조건)출력문에서 for문을 이용하시오

<결과>
# # # # # # # # # # 

 * 
 *==================================================================================================================
 * 제네릭을 이용해 풀기
 * 
 * 처음 new를 이용해 객체를 생성할 때 자신의 원하는 타입의 속성을 넣으주면 해당 속성으로 자동으로 타입이 변환된다.
 * (get, set을 이용해 출력하기)
 * 
 * 객체 생성시 두 가지 타입의 속성을 넣어도 괜찮다.
 * man<String, Integer> man1 = new man<>();

   class 클래스 이름<타입 1, 타입 2>		타입의 이름은 임의로 먼둘묜 된다.
	private(get, set을 이용하기)
	
	public static <T,T2> void info(T t, T2 t2) 제네릭 메소드
	
	
	https://seeminglyjs.tistory.com/184
========================================================================================================
제네릭은 생성자도 포함하고 있음
 */