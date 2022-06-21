package get_06_21;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Input name:");
		String name=in.nextLine();
		
		System.out.print("\nInput gender:");
		String gender=in.nextLine();
		
		System.out.print("\nInput age:");
		int age=in.nextInt();
		
		in.nextLine();
		System.out.print("\nInput tall:");
		String tall=in.nextLine();
	
		String result=(gender=="M") ?(result="남자"):(result="여자");
		
		System.out.println("\n----걸과----");
		System.out.println("이름:"+ name);
		System.out.println("성별:"+ result);
		System.out.println("나이:"+ age);
		System.out.println("신장:"+ tall);
	
	}
	

}
/*
 * ============================================================================
 * [문제10] 4개의 값을 콘솔에서 입력받아 처리하시오
        조건) 성별 : M 이면 "남자", 나머지 "여자" 
             (삼항연산자 이용)

Input name: 장미란
Input gender: F
Input age:  25
Input tall: 173.3 

--결과--
이름 : 장미란
성별 : 여자 
나이 : 25세
신장 : 173.3cm  
출처: https://private.tistory.com/13 [공부해서 남 주자:티스토리]

======================================================================================
 * 
 * prinf, scanner *4(String name, char gender, int age, double tall)
 * 
 * (gen==M)? 남자:여자
 * 
 * 
 * 
 * 
 * 
 * ====================================================================================

 * 객체.nextLine() 
 * 버퍼값 비우기
 */

