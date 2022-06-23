package get_06_23;

import java.util.Random;

public class Ex_14 {

	public static void main(String[] args) {
		
		int count=0;
		
		Random r=new Random();
		
		int arr[]= new int[50];
		
		for(int i=0; i<50; i++) {
			arr[i]=r.nextInt(100)+0;
			if(i%6==0) {
				System.out.println();
			}
			System.out.print(arr[i]+"\t");
			count+=arr[i];
		}
		System.out.println("\n합="+count);
	}

}
/*
 * 1.총합을 저장하는 변수 초기화 선언
 * 2.Random 클래스의 변수 r 에 Random 객체를 생성하여 저장한다
 * (Random 클래스로 인스턴스화 하여 저장, 메모밀 할당 및 랜덤 클래스 사용가능)
 * 3.배열 크기를 50으로 하여 객체 생성
 * 4.arr[i]=r.nextInt(100)+0; 
 * 랜덤 클래스 r 변수에서 Int형으로 값을 받는다. 0부터 100까지
 * 5.배열 오소의 합을 저장해 준다.
 * ===========================================================
 * 
 * [문제14] 50개의 난수를 만들어서 다음과 같이 출력하시오
       조건1) 0 - 100 사이의 수 일것
       조건2) 1줄에 6개씩 표시하시오  

--출력--
12      72      74      0       20      89
84      83      53      0       95      53
68      55      89      6       20      68
17      9       75      56      17      85
62      33      7       34      85      28
28      55      95      31      69      22
30      92      1       16      88      80
64      55      71      12      29      72
20      41
합=2420
출처: https://private.tistory.com/13 [공부해서 남 주자:티스토리]
 * ============================================================
 * =>
 * 랜덤 메소드
 * import java.util.Random;(임포트 하기)
 * (int형으로 받을 때) 객체(랜덤).nextInt(최대값)+최소값
 * 
 * =>
 * 배열 사용시 요소의 크기를 미리 선언해주기
 * (int)값을 받을 때는 nextInt()메소드를 사용한다.
 * 
 * 
 */
