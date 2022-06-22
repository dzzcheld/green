package get_06_22;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		
		char grade_result;
		String result;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("중간고사를 입력하시오:");
		int mid_term=in.nextInt();
		
		System.out.print("기말고사를 입력하시오:");
		int final_term=in.nextInt();
		
		System.out.print("레포트고사를 입력하시오:");
		int report=in.nextInt();
		
		System.out.print("출석고사를 입력하시오:\n");
		int attendance=in.nextInt();
		
		System.out.println("중간고사 :"		+ mid_term +
							"\n기말고사 :"		+ final_term +
							"\n레포트  :" 		+ report + 
							"\n출석고사 :" 	+  attendance
							);
		
		double score=(double)((((mid_term + final_term)/2)*0.6)+
							 (report*0.2)+
							 (attendance*0.2));
		System.out.printf("성적=%.2f\n",score );
		
		if(score>=90) {
			char grade='A';
			grade_result='A';
		}else if(score>=80){
			char grade='B';
			grade_result='B';
		}else if(score>=70) {
			char grade='C';
			grade_result='C';
		}else if(score>=60) {
			char grade='D';
			grade_result='D';
		}else {
			char grade='F';
			grade_result='F';
		}
		System.out.println("학점="+grade_result);
	
	
	// grade_result 가 A,B 면 excellent  C,D면 good, F 면 poor
	   
		switch(grade_result) {
		
		case 'A' :result="excellent";
		System.out.println("평가="+result);
					break;
		case 'B' :result="excellent";
		System.out.println("평가="+result);
		break;
		case 'C' :result="good"; 
		System.out.println("평가="+result);
		break;
		case 'D' :result="good"; 
		System.out.println("평가="+result);
		break;
		case 'F' :result="poor"; 
		System.out.println("평가="+result);
		break;
					
							}
		
			
			
}

}
/*
 * 자료 입력( int 형 4개 변수 )
 * 자료 입력 출력
 * 상적(double, 저장되는 값 형변환), 학점 , 평가 변수는 문자열
 * 
 * midterm, final, report, attendance(int)
 * score, grade, result
 * 
 * 조건1)
 * ((mid+final)/2)*0.6
 * report*0.2
 * attendance*0.2
 * 를 스코어에 저장함
 * 
 * 조건2)
 * score 에 따라 다중 if-else 문으로 점수별로 학점 채점
 * 후 grade 에 저장하고 출력함. 점수 조건에 A, B, C, D를 논리연산자로 같이 적용시킴.
 * 
 * =========================================================================
 * 
 * ===============================================================
 * [문제12]성적처리프로그램
        
--입출력 화면--

   중간고사를 입력하시오 : 90
   기말고사를 입력하시오 : 89
   레포트고사를 입력하시오 : 99
   출석고사를 입력하시오 : 100

   중간고사 : 90
   기말고사 : 89
   레포트 : 99
   출석 : 100

   성적=93.20      <---소수이하 2째자리까지
   학점=A              System.out.printf("성적 : %.2f", avg);
   평가=excellent


   조건1) (중간+기말)/2      ---> 60%
          레포트             ---> 20%
          출석               ---> 20%
     
   조건2)  90이상 'A'학점     (3)A,B학점  ---->"excellent"
           80이상 'B'학점        C,D학점  ---->"good"
           70이상 'C'학점        F학점    ---->"poor"
           60이상 'D'학점        (switch문이용) 
           나머지 'F'학점
           (if~else if문이용)

출처: https://private.tistory.com/13 [공부해서 남 주자:티스토리]==
 * ========================================================================
 * 
 * 
 * 
 * 
 */
