package test_06_20;

public class Ex_4 {

	public static void main(String[] args) {
		
		String name="이효리";   		// println 으로 출력
		String department="개발부";		// printf()
		String position="대리";			// print() 직위, 급여 출력
		int sal=1500000; 
		
		System.out.println("---------출력-----------");
		System.out.println("이름:" + name);
		System.out.printf("부서:%s", department);
		System.out.print("\n직위:"+ position + "\n급여:"+sal);
	}

}


/*
 * [문제4] 각각변수에 대입하여 출력하시오
   조건1) data는 이효리, 개발부, 대리, 1500000로 대입
          변수명은 각각  name,department,position,sal로 할것
   조건2)출력은 아래와 같은 메서드(함수)를 이용하시오

--출력--
이름 : 이효리     ---> println
부서 : 개발부     ---> printf  
직위 : 대리       ---> print 1번만써서 직위,급여출력
급여 : 1500000원
출처: https://private.tistory.com/13 [공부해서 남 주자:티스토리]

	
 * String name="이효리"   		// println 으로 출력
 * String department="개발부"		// printf()
 * String position="대리"			// print() 직위, 급여 출력
 * int sal=1500000; 
 * 
 * 
 * =>
 * print와 println은 줄바꿈 유무가 다르다.
 * 
 */
