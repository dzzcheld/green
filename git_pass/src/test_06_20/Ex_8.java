package test_06_20;

import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		
		int i=0;
		
		
		while(i<5) {
		Scanner in=new Scanner(System.in);
		
		System.out.printf("점수 입력:\n");
		int score=in.nextInt();
		
		if(score<0 || score>100) {
			System.out.println("입력오류\n");
			continue;
				}else {
		
		int result=score;
		System.out.print("입력된 값:"+result);
		break;
				}
			
		}
		
	}

}
/*
 * [문제8] 값을 입력받아 0보다 작거나 100보다 크면 "입력오류!!"  출력
        (if문과 ||연산자를 이용하시오)

점수입력 : 120
입력오류!!

점수입력 : 55
입력된값 : 55

출처: https://private.tistory.com/13 [공부해서 남 주자:티스토리]

===================================================================================
 *
 *반복문
 *값 입력 => scanner 객체 생성
 *점수가 변수에 저장 => score=nextInt()
 *오류 출력시 다시 값 입력 => 
 *if(score<0 || score>100)
 *  오류 출력, continue 시도
 * else result=score 후에 출력하기
 *
 * 
 *
 * 
 */
