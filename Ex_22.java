package get_0628;

import java.util.Scanner;

public class Ex_22 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("크기를 입력하시오:");
		double len=(double)Integer.parseInt(sc.nextLine());	//	배열의 크기
		
		
		double []arr= new double[(int)len];
		System.out.println("크기는"+ arr.length+"입니다");
		
		int i=0;
		double count=0;
		
		while(true) {
		
		System.out.print("요소값을 입력하세요:");
		double answer=sc.nextDouble();
		//System.out.println("입력 값은"+answer);
		arr[i]= answer;
		count+=answer;
		i++;
		
		if(arr.length==i) {
			System.out.println("평균은"+ count/arr.length);
			System.out.println("종료합니다");
			break;
		}
		
		}
		
	}

}
/*
 *scanner 객체 생성
 *
 *while문(입력 받은 배열의 크기 만큼 반복)
 *scanner 로
 *배열의 크기 만큼 데이터 입력
 *
 *평균 구하기(배열의 크기로)
 *
 *
 *
 *-==================================================================
 * Argumrnt 로 베열의 갯수 입력
 * 
 * 배열의 갯수만큼 데이터를 입력 받는다
 * 
 * 입력 받은 데이터를 출력함
 * 
 * 모든 데이트의 평균을 구하여 소수이하 2째자리
 * 
 * ==========================================================================================================
 * [문제22]Argument를 통해 배열의 갯수를 입력받은후 
배열갯수만큼 반복하여 데이타를 입력받아 처리하시오
$ java Test22  5

score[0] : 34.5
score[1] : 90.4
     .
     .
score[4] : 100.0


평균 : ??.??   <--- 소수이하 2째자리
출처: https://private.tistory.com/13 [오토봇팩토리:티스토리]
 * 
 */