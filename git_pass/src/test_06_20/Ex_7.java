package test_06_20;

import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Input a: ");
		int input_a=in.nextInt();
		
		
		System.out.print("Input b: ");
		int input_b=in.nextInt();
		
		in.nextLine();
		
		int result=(input_a>input_b)? (result=input_a):(result=input_b);
		
		System.out.printf("큰 수: %d" , result);
	}

}


/*
 * [문제7] BufferedReader를 이용하여 입력받아 두수중 큰수를 출력하시오
        (단, 비교연산은 삼항연산자를 이용하시오)
Input a : 5
Input b : 13

큰수 : 13
출처: https://private.tistory.com/13 [공부해서 남 주자:티스토리]
=================================================================================
 * 삼항연산자
 * 조건? a:b;
 * 
 * 변수 a, b, result(삼항연산자)
 * scanner로 입력(import, 객체,system in,)
 * 삼항연산자로 비교를 한다.(최종 출력)
 * 
 * =============================================================================
 * 객체.skip("[||r||n]+"); 버퍼 비우기
 * 객체.nextLine(); 버퍼 비우기
 */
