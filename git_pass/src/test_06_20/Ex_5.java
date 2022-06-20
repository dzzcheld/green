package test_06_20;

import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		
		
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Input name:");
		String name=in.nextLine();
		
		System.out.print("kor:");
		int kor=in.nextInt();
		
		System.out.print("eng:");
		int eng=in.nextInt();
		
		System.out.print("mat:");
		int mat=in.nextInt();
		
		int sum=kor+eng+mat;
		double avg=((double)sum/3);		//	format(%0.1f, avg)
		
		System.out.println("------출력-------");
		System.out.println("이름:"+name);
		System.out.println("합계 점수:" +sum);
		System.out.println("평균 점수:" +String.format("%.0f", avg) );
	}

}

/*
 * [문제5] 다음을 입력받아 계산하시오

--입력--
Input name : 민들래
kor : 90 
eng : 70 
mat : 75

--출력--
이름 : 민들래
합계점수 : 235점
평균점수 :  78.3   <-- 소수 1자리까지출력하시오
출처: https://private.tistory.com/13 [공부해서 남 주자:티스토리]
 * =================================================================================
 * 이름, 3과목 점수로 변수는 4개가 필요하다.
 * 
 * scanner 사용(import, 객체 생성)
 * 문자열, 정수형 3개 입력 후 저장
 * 
 * 합계 점수와 평균(소수 1자리까지 출력)
 * Math.round() 혹은 format.String() 사용한다.
 * =================================================================================
 * 
 * =>
 * 사용자로부터 입력을 받기 위한 System.in 을 포함한다.
 * 초기화 선언 한 변수들은 스캐너 객체를 저장 할 수 없나?(in 이랑 충동)
 * 
 * String.format("%.0f", avg)
 * -12자리 차지함, %-12로 하면 왼쪽 정렬
 * -%뒤에 0을 붙였는데 정수값이 있으면 오류 발생
 * -printf 랑 비슷하다.
 * 
 * double avg=((double)sum/3);
 * -double 형 변환을 빼면 값이 int 값으로 명시적 형변환 되기에 값의 손실이 있을 수 있다.
 * 
 * nextInt는 버퍼값이 남이 있으므로, 이를 Integer.parseInt로 변환한다
 * 
 */
