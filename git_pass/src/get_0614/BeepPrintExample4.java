/*package get_0614;

public class BeepPrintExample4 {

	public static void main(String[] args) {
		
		Thread thread=new BeepThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {Thread.sleep(500);}catch(Exception e) {}
		}

	}

}
/*
 * ���� ������� �۾� �����尡 ���ÿ� ����
 * (���� �޼ҵ�, ���� �۾�)
 * 
 * Thread ��ü ����
 * (BeepThread �� Thread Ÿ������ �ν��Ͻ�ȭ)
 * 
 * thread.start()
 * start�޼ҵ�� ���� �Ŀ� ��ٷ� ����ȴ�.
 * 
 * �����带 �����ϴ� �ڵ�
 * Thread�� ���� Ŭ������ ����� run() �޼ҵ带 �������̵� �Ѵ�.
 * run() �޼ҵ�� Thread�� start() �޼ҵ尡 ȣ����� �� ����Ǵ� �޼ҵ�.
 * 
 * run()
 * Toolkit �� ��ü�� ���, Toolkit Ÿ���� toolkit �� �����Ѵ�.(�ν��Ͻ�ȭ)
 * 0.5 �� ���� beep ���� 5�� �ݺ�-
 * 
 * *
 */