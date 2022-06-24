package get_06_24;

import java.util.Scanner;


public class Ex_17 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("x값을 입력하시오:");
		int x=in.nextInt();
		
		System.out.print("y값을 입력하시오:");
		int y=in.nextInt();
		
		
		System.out.print(x +" 의"+ y +" 승은 " + (int)Math.pow(x, y) );

	}

}
/*
 * 
 * [문제17] for문을 이용하여 제곱승을 구하시오

x의 값을 입력하시오 : 3
y의 값을 입력하시오 : 3
3의 3승은 27
출처: https://private.tistory.com/13 [공부해서 남 주자:티스토리]
 * 
 * scanner 객체 생성 후 
 * nextInt()로 저장하기
 * 
 * Math.pow()
 * 
 */
