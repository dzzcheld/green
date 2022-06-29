package get_06_29;

import java.util.*;
import java.io.*;


public class Ex_24 {

	public static void main(String[] args) throws IOException{
		
		Random ran=new Random();
		int r=ran.nextInt(100)+0;
		
		BufferedReader rb=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("랜덤"+ r);
		
		int i=0;
		int count=0;
		while(true) {
			
			System.out.print("숫자입력(0~100)");
			int save=Integer.parseInt(rb.readLine());
			
			if(save==r) {
				System.out.println("맞았다(" + i + "번)" );
				break;
			}
			
			else {
				i++;
				continue;
				
			}
			
					
		}
		

	}

}
/*
 * 랜덤
 * 버퍼
 * 조건문(랜덤, 버퍼 비교)
 * ========================================================================================================================================
 * [문제24] 숫자맞추기 게임
컴퓨가 0~100사이의 임의의수 하나를 발생  

55     <----화면에 보이면 안됨
숫자입력(0~100) : 50
크다

숫자입력(0~100) : 60
작다

숫자입력(0~100) : 55
맞았다(3번)


계속(y/n) : y
숫자입력(0~100) : 
출처: https://private.tistory.com/13 [오토봇팩토리:티스토리]
 * 
 */