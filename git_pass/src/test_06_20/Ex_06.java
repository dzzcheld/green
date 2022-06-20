package test_06_20;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("--------입력--------");
		System.out.print("밑변:");
		int bot=in.nextInt();
		System.out.print("높이:");
		int hei=in.nextInt();
		
		double total=(double) bot*hei/2;
		
		System.out.println("--------출력--------");
		System.out.printf("넓이:%.2f", total);
		
	}

}
/*
 * [문제6] 다음을 입력받아 계산하시오
        (삼각형넓이 = (밑변 * 높이)/2)  

--입력--
**** 삼각형의 넓이 구하기  ****
밑변 :  10  
높이 :   3
   

--출력--
넓이 :   XX.XX  <--- 소수 2자리까지출력하시오
출처: https://private.tistory.com/13 [공부해서 남 주자:티스토리]
=============================================================================================
 * 밑변 높이, 넓이 변수 세 개
 * 
 * scanner(import,객체 생성)
 * 
 * nextint 로 저장하기
 * 
 * printf로 형식 지정해주기 %.3f
 * 
 * System.out.printf("밑변:"+ String.format("%.2f", total));
 * 
 * 
 */
