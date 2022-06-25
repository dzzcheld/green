package get_06_25;

class Ex_output_2{
	
	 int a;
	 char sharp;
	
	public Ex_output_2(int a, char sharp) {
		this.a=a;
		this.sharp=sharp;
	}
	
	public void output() {
		for(int i=0; i<a; i++) {
			System.out.print(sharp+"\t");
		}
	}
	
}

public class Ex_20_2 {

	public static void main(String[] args) {
		
		Ex_output_2 meth=new Ex_output_2(10,'#');
		meth.output();
	}

}
/*
 * 생성자 및 필드를 이용해서 풀어보기
 * (객체 생성시 인자값을 줘서 필드에 저장한다.)
 * 필드 int a, char sharp
 * 생성자
 * 
 * 메소드 호출시 인자값은 안 줘도 된다. 
 * 
 * 
 * 
 */