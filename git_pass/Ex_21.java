package get_06_27;

import java.util.Scanner;

class Compute {
	
    void compute(String item,  int price,int qty) {
		System.out.println("품명 : "+item);
		System.out.println("금액 : " + price*qty);	
	}
    void compute(int price,int qty) {
		
		System.out.println("금액 : " + price*qty);	
	}
	
}

public class Ex_21 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-입력-");
		
		System.out.print("품명:");
		String item=sc.nextLine();
		
		System.out.print("수량:");
		int qty=Integer.parseInt(sc.nextLine());
		
		System.out.print("단가:");
		int price=Integer.parseInt(sc.nextLine());
	
		Compute com = new Compute();
		com.compute(item, price, qty);
		
		
	}

}

/*
 * 스캐너 객체 생성
 * item, qty, price 저장 
 * 
 * Compute 객체 생성
 * (compute 메소드를 사용하기 위해서)
 * 메인 메소드 안에 있기에 item, price, qty 를 사용할 수 있음
 * 
 * Compute 메소드를 호출(매개 변수, 인자값은 item, price, qty)
 * 
 * =====================================================================================================================
 * [문제21]값을 입력받아 함수호출하여 처리하시오
        조건1)입력받은 값을  compute(item, qty, price)함수에서 처리
        조건2)계산방법 : 금액 = 수량 * 단가

-입력-
품명 : apple
수량 : 10
단가 : 1200

-출력-
품명 : apple
금액 : 12000원
출처: https://private.tistory.com/13 [오토봇팩토리:티스토리]
 * 
 * ==================================================================================================================================
 * =>
 * 메서드의 매개변수는 void 여러 타입을 받을 수 있다(반환형이랑 달라도 무관함)
 * 
 */
