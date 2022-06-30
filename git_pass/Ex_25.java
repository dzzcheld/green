package get_0630;

import java.util.*;
import java.io.*;

public class Ex_25 {

	public static void main(String[] args) throws IOException{
		
		//버퍼 객체 선언
		BufferedReader fr=new BufferedReader(new InputStreamReader(System.in));
		
		// 배열 초기화 선언
		int []month= {31, 28, 31, 30, 31,
					  30, 31, 31, 30, 31,
					  30, 31};
		
		System.out.print("--입력/출력 \n");
		
		//	달 입력(버퍼)
		System.out.print("원하는 달:");
		int buf=Integer.parseInt(fr.readLine());
		
		System.out.println(buf + "월은" + month[buf-1] + "일 입니다.");
		

	}

}
/*
 * 
 * 
 * 
 * 
 * 배열선언
 * 
 * 버퍼 객체 생성후 int로 저장하기
 * 
 * 1을 입력하면 인덱스 0이 나온다
 * 2를 입력하면 인덱스 1이 나온다
 * (버퍼값 -1과 인덱스가 일치해야됨)
 * 
 * =============================================================
 * [문제25] 배열을이용하여 날짜를 기억시킨후
int []month={31,28,31,30,31,30,31,31,30,31,30,31};

--입력/출력--

원하는 달 : 3
3월은 31일입니다...
출처: https://private.tistory.com/13 [오토봇팩토리:티스토리]
 */
