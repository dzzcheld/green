package get_06_24;

import java.util.Random;
import java.util.Scanner;

public class Ex_15 {

	public static void main(String[] args) {
		
		
//		int rand=0;
		int result=0;
		
		Scanner in=new Scanner(System.in);
		Random r=new Random();
		
		System.out.println("난수가 발생하였습니다.");
		int rand=r.nextInt(10)+0;
		
		
		int count[]=new int[100];		//	100번 안에는 끝나지만 동적 으로 바꾸고 싶음
		int i=0;
		while(true) {
			
			System.out.print("숫자 입력:");
			int scan=in.nextInt();
			
			count[i]=scan;
			result ++;
			if(rand==scan) {
				System.out.println("정답:"+result + "번");
				break;
			}else if(scan<rand){
				System.out.println("컴퓨터의 숫자가 더 큽니다");
				result+=i;
				continue;
				
			}else {
				System.out.println("컴퓨터의 숫자가 더 작습니다");
				result+=i;
				continue;
			}
				
			
		}
		
	}

}
/*
 * 난수 발생(객체 생성)	=>	r
 * 사용자가 입력값을 준다	=> in
 * 입력값과 난수의 차이가 있다면 크다 혹은 작다로 표현  =>	if문으로 r 과 in 을 비교하기
 * 맞추면 몇번만에 맞췄는지 알려주기		=>		i의 횟수를 저장하기(while문), count 에 저장하기
 * 
 * 반복문에서 i번 만큼 nextInt()로 받은 횟수를 저장하여 출력해줌
 * 
 * while(true)
 * if=>break;
 * else=>i++
 * =========================================================================
 * 문제15] 2자리의 난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램
         난수발생) 1. int a=(int)(Math.random()*100) : 0 - 99 사이의 난수
                   2. ① import java.util.Random;
                      ② Random 변수1 = new Random();
                      ③ int 변수2 = 변수1.nextInt(최대값); 
                               ==>  0 ~ (최대값 - 1)사이의 임의의 수

[실행결과]

*** 난수가 발생하였습니다...맞추어 보세요...*** 

숫자 입력 : 50
컴퓨터의 숫자가 더 큽니다..

숫자 입력 : 90
컴퓨터의 숫자가 더 작습니다..

          :

숫자 입력 : 83
추카추카...xx번만에 맞추셨습니다...
출처: https://private.tistory.com/13 [공부해서 남 주자:티스토리]
 */
