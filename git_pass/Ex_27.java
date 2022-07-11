package git_root;

public class Ex_27 {

	public static void main(String[] args) {
		
		String []name= {"소서노", "주몽", "모팔모"};
		int [] [] score= {{90, 95, 100, 0}, {75, 55, 65, 0}, {100, 100, 100, 0}	};
		double [] avg= {0.0, 0.0, 0.0};
		char [] grade=new char[3];
		String []pass=new String[3];
		int []rank= {1, 1, 1};
		
		int total=0;
		double avg_total=0;
		
		for(int i=0; i<3; i++) {
			System.out.print(name[i] + "\t");
			for(int k=0; k<3; k++) {
				System.out.print(score[i][k] + "\t");
				total+=score[i][k];
				if(k==2) {
					System.out.print("총합"+total+"\t");
					avg_total=(double)total/3;
					//System.out.print("평균"+avg_total+"\t");
					total=0;
				}
				avg[i]=avg_total;
				if(k==2) {
				System.out.print("평균은" + avg[i]+"\t");
				}
			}
				//	//////////////////////////////////
			if(avg[i]>=90) {
				System.out.print("A\t");
			}//
			else if(avg[i]>=80){
				System.out.print("B\t");
			}//
			else if(avg[i]>=70){
				System.out.print("C\t");
			}//
			else if(avg[i]>=60) {
				System.out.print("D\t");
			}
			else {
				//f
				System.out.print("F\t");
			}
				
			//////////////////////////////////////
			if(avg[i]>=60) {
				System.out.println("pass");
			}else {
				System.out.println("fail");
			}
			
			System.out.println("");
			
			
			
		}
		
	
			
			
	}

}


/*
 * 
 * 
 * =======================================================================
 * 처리조건
조건1) 변수
     String []name ={"소서노","주몽","모팔모"};
     int [][]score = {{90,95,100,0},{75,55,65,0},{100,100,100,0}};
     double []avg = {0.0, 0.0, 0.0};
     char []grade = new char[3];
     String []pass = new String[3];
     int []rank ={1,1,1};

조건2) 총점 = 국어 + 영어 + 수학
       평균 = 총점/3;
       학점 = 90이상 'A' / 80이상 'B' / 70이상 'C' / 60이상 'D' / 나머지는 'F'
               (if ~ else if문 이용)
       재수강 = 60이상이면 "pass"  60미만이면 "fail"
               (if~else문)
       순위구하기    

번호    이름      국어    영어    수학    총점    평균    학점    재수강    순위
------------------------------------------------------------------------------
   1      소서노     90       95       100
   2      주  몽     75       55        65
   3      모팔모     100     100       100
출처: https://private.tistory.com/13 [오토봇팩토리:티스토리]

출처: https://private.tistory.com/13 [오토봇팩토리:티스토리]
 * =======================================================================================
 * 
 * 
 * 
 * */
