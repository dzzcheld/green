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
 * ������ �� �ʵ带 �̿��ؼ� Ǯ���
 * (��ü ������ ���ڰ��� �༭ �ʵ忡 �����Ѵ�.)
 * �ʵ� int a, char sharp
 * ������
 * 
 * �޼ҵ� ȣ��� ���ڰ��� �� �൵ �ȴ�. 
 * 
 * 
 * 
 */