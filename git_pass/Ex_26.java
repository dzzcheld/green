package get_0701;

public class Ex_26 {

	public static void main(String[] args) {
		int []num= {23, 45, 13, 50, 25};
		int tmp=0;
		
		for(int i=0; i<5; i++) {
			if(num[i+1]>num[i]) {
				continue;
			}else{
				tmp=num[i];
				num[i]=num[i+1];
				num[i+1]=tmp;
				
			}
			
			for(i=0; i<5; i++)
				System.out.println("결과는" + num[i]);
	
		}
	
	
	}
}
	

/*
 * i=0일 떄
 * 1인덱스가 0인덱스 보다 크기에 유지
 * 
 * i=1 일 떄
 * 인덱스 1이 인덱스 2보다 크기에 45가 2에 들어감
 * 
 * i=2 일 떄
 * 인덱스 3이(50) 2보다(45) 크기에 유지
 * 
 * =>모든 요소와 비교하지 않으며 가장 큰 수가 멈춘다.
 * 
 * 
 *===================================================================
 *[문제26] 크기가 5인 정수형배열을 잡아 난수(1~50)를 저장하여 출력하시오


--출력--

[정렬전]
num[0]=23  num[1]=45  num[2]=13  num[3]=50  num[4]=25

[정렬후]
num[0]=13  num[1]=23  num[2]=25  num[3]=45  num[4]=50

합 = xx
출처: https://private.tistory.com/13 [오토봇팩토리:티스토리] 
 * 
 *
 */