package get_06_24;

public class Ex_16 {

	public static void main(String[] args) {
		
		int i=0;
		int []arr=new int[100];
		
		
		while(i<100) {
			
			int arr_result=arr[i]=i+1;	
		//	System.out.println(arr_result);
			i++;
			if((arr_result%3==0)&&(arr_result%7==0)) {
				System.out.println(arr_result);
			}
			
			
		}

	}

}
/*
 * 배열을 생성하고 요소로 1~100까지 저장하기
 * 
 * while 문으로 배열 초기화 선언
 * 
 * 저장된 배열 요소를 조건을 넣어서 해당되면 출력
 * 
 * 1~100까지 숫자 생성
 * 
 *  (a%3==0 && a%==0)
 * 
 * ==================================================================
 * [문제16]1~100사이의수 중에서  3의 배수이면서 7의 배수 구하기 
      조건) for문과 && 연산자를 반드시 이용

--출력--
  21 42 63 84   
출처: https://private.tistory.com/13 [공부해서 남 주자:티스토리]
 * 
 */
