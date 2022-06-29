package get_06_29;

import java.io.*;
import java.util.*;

public class Ex_23 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int [] arr_age=new int[3];
		String [] arr_name=new String[3];
		/////////////////////////////////////////////////////
		
		for(int i=0; i<3; i++) {
		
		System.out.println("---입력---");
		
		System.out.print("이름:");
		String name=br.readLine();
		arr_name[i]=name;
		System.out.println(arr_name[i]);
		
		System.out.print("나이:");
		int age=Integer.parseInt(br.readLine());
		arr_age[i]=age;
		System.out.println(arr_age[i]);
		
		}
		br.close();
	}

}
/*
 * import 
 * 
 * Exception
 * 
 * 버퍼객체 생성
 * BufferReader(new InputStreamReader(Sys.in));
 * 
 * print 입력
 * print 이름:
 * reline()으로 문자열을 받고 저장함
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * [문제23]BufferedReader를 이용하여 입력받기
이름, 나이....각각 배열을 3개씩 만들어서 입력 받기

--입력--
이름 : 주몽 
나이 : 20

이름 : 소서노
나이 : 21

이름 : 모팔모
나이 : 52

--출력--
주몽     20세
소서노   21세
모팔모   52세
출처: https://private.tistory.com/13 [오토봇팩토리:티스토리]
 * 
 * ===================================================
 * 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// BufferedReader를 사용하기 위해서는 throws IOException을 해 주어야 함.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언

		int N = Integer.parseInt(br.readLine()); // readLine으로 받은 입력 데이터 String임.
		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		br.close();
	}

}

write()
출력할 내용을 담는다

flush()
버퍼를 비워내는 동시에 콘솔에 출력
write 사용시 같이 사용하야 콘솔에 출력이 된다

close()
스티림을 닫는다
 */
