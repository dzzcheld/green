/*package get_0614;


public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		Runnable beepTask=new BeepTask();
		Thread thread=new Thread(beepTask);// Ŭ���� �ν��Ͻ��� �������� �����ڷ� �����Ѵ�(run())
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {Thread.sleep(500);}catch(Exception e) {}
		}

	}

}
/*	���� ������� �۾� �����尡 ��ÿ� ����
 * (���� �޼ҵ�, �� �۾����� �����带 ����)
 * Runnable beepTask=new BeepTask();
 * BeepTask �̶�� ��ü�� , Runnable Ÿ������ �ν��Ͻ�ȭ �Ѵ�.
 * (�޸� ����, Runnable �ʵ带 ��� �� �� �ִ�.)
 *
 * Thread thread=new Thread(beepTask);
 * �ν��Ͻ��� ������ �� beepTask �� ���� �Է��Ѵ�
 * Thread ������ Ÿ������ Thread ��ü�� �ν��Ͻ�ȭ �Ѵ�.
 * ������ thread, Runnable target
 * 
 * thread.start();
 * ���ο� �����尡 �����Ǿ� run �޼��带 ȣ���Ѵ�.
 * 
 * 
 * start()
 * �̸� �����ϸ� Thread�� ���� �����Ͽ� start �Ѵ�. 
 * start�ϰԵǸ� run()�޼��尡 ȣ��ȴ�.
 * ��Ƽ������� �۵��Ѵ�.(�ڵ��� �Ϸ� ���ο� ������� �Ʒ� �ڵ带 �����Ѵ�.)
 * 
 * run()
 * Thread�� �������� ������, �׳� run()�޼ҵ常 ����ȴ�
 * �̱۾������ �����Ѵ�.
 * 
 * Runnable
 * Ŭ������ ��ӹ����� �ٸ� Ŭ������ ��ӹ��� �� ���⿡, 
 * �������̽��� Runnable �� �����ϴ� ����� �Ϲ����̴�.(�ٸ� Ŭ������ ��ӹޱ� ����)
 * 
 * ���뼺�� ���� �ڵ��� �ϰ����� ������ �� �ִ�.
 * 
 * 
 * 1.������ ����
 * Thread thread=new Thread(beepTask);
 * 
 * 2.������ ����
 * thread.start();
 * ����� ���� ��ٷ� ���� �ȴ�.
 * 
 * 3.������ ���� �ڵ�(���)
 * java.lang.Runnable �������̽��� ������ ������Ʈ�� Thread�� �������� �Ķ���ͷ� ����� ���.
 
 *4.run() �޼ҵ带 ȣ���ϱ� ����
 *  BeepTask Ŭ������ �ν��Ͻ�(beeptask)�� Thread�� �����ڷ� �����Ѵ�.
 *
 */
