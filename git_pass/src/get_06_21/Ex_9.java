package get_06_21;

import java.util.Scanner;

public class Ex_9 {
	public static void main(String[] args) {
		
		
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Input Character:");
		char input=in.next().charAt(0);
		int ca=(int)input;		//	int 형으로 형변환
		
		if((65<=ca && ca<=90)) {
			//대문자를 소문자로 변환
			String result=String.valueOf(input);
			String result_1=result.toLowerCase();
			System.out.println("result:"+result_1);
		}else if(97<=ca && ca<=122){
			//소문자를 대문자로 변환
			System.out.println("소문자를 대문자로 변환");
			String result=String.valueOf(input);
			String result_1=result.toUpperCase();
			System.out.println("result:"+result_1);
			
		}else if(ca<=91 && ca<=96) {
			System.out.println("입력데이터 오류");
			
		}
		
	
	}
	
}
/*
 * 
 * [문제9] 입력된 문자가 대문자이면 소문자로 출력하고
        소문자이명 대문자로 변환하여 출력하시오
        그외의 문자이면 "입력데이타오류"라고 표시하시오
        (if-else문 이용)   

Input Character: A
result : a

Input Character: a
result : A

Input Character: *
입력데이터 오류
e
출처: https://private.tistory.com/13 [공부해서 남 주자:티스토리]
=================================================================================================
 *
 *스캐너(임포트, 객체, system in)
 *scanner에서 문자를 바로 입력 받는 기능은 없기에
 *next()로 문자열을 입력받아 charAt(0)으로 첫번째 문자를 받아 올 수 있다.
 *
 * 
 *  


 * ====================================================================================
 * 
 * 객체.next().charAt(0);
 * Scanner에서 문자를 바로 입력받는 기능은 없기에 
 * next()로 문자열을 입력받아 charAt(0)으로 첫번째 문자를 받아 올 수 있다.
 * 
 * valueOf()
 * ()안에 객체를 String 객체로 변환시키는 역할.
 * 
 * 아스키코드 표
 * 대문자 65~90
 * 소문자 97~122
 * 
 * toUpperCase 는 모든 문자열을 대문자로 변환합니다.
 * toLowerCase 는 모든 문자열을 소문자로 변환합니다.
 * 
 * 
 */
