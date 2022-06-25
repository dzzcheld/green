package get_06_25;

class Ex_output{
	
	public void output(int a, char sharp) {
		for(int i=0; i<a; i++) {
			System.out.print(sharp+"\t");
		}
	}
	
}

public class Ex_20 {

	public static void main(String[] args) {
		
		Ex_output meth=new Ex_output();
		meth.output(10,'#');
	}

}
/*
 * 메인에서 인자값을 int 10, char # 으로 호출한다
 * 
 * 메소드로 호출하기에 생성자 및 필드는 필요없음(인스턴스화 할 떄 인자값을 넣을 떄 사용함)
 * 
 *  output 메소드에서
 *  반복문 실행
 * 
 * 
 * 제네릭으로 풀기
 * =====================================================================
 * [문제20] output(10,'#')함수를 호출하여 다음과 같이 출력하시오
        조건)출력문에서 for문을 이용하시오

<결과>
# # # # # # # # # # 

출처: https://private.tistory.com/13 [공부해서 남 주자:티스토리]
 * 
 * 
 */
