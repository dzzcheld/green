package get_0614;

public class ThreadnameExample {

	public static void main(String[] args) {
		
		Thread mainThread=Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�:" + mainThread.getName());
		
		ThreadA threadA=new ThreadA();
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB=new ThreadB();
		System.out.println("�۾� ������ �̸�: " + threadB.getName());
		threadB.start();
	}

}
/*
 * ���� thread
 * main �̸��� ������, setName()�� �̸��� ���氡��, getName() �޼ҵ�� Thread �̸��� �� �� ����.
 * 
 * Thread mainThread=Thread.currentThread();
 * ���� �������� ������ ��ü�� �����Ѵ�. ���� ���� 
 * 
 * mainThread.getName()
 * mainThread �� �̸��� �� �� ����.
 * 
 * Thread A �� ������Ÿ�� ThreadA�� �ν��Ͻ�ȭ �Ѵ�.
 * getName() �޼ҵ带 ����� ThreadA�� �̸��� �� �� �ִ�.
 * ThreadA���� (������ Ÿ��) start �޼ҵ带 ȣ���Ѵ�.
 * 
 * start()
 * ����Ǹ� �� �ٷ� ����Ǵµ�, 
 * Thread�� ���� Ŭ������ ����� run() �޼ҵ带 �������̵� �Ѵ�.
 * run() �޼ҵ�� Thread�� start() �޼ҵ尡 ȣ����� �� ����Ǵ� �޼ҵ�.
 * 
 * ���� Ŭ������ ThreadA
 * setName���� threadA�� �̸��� "ThreadA"�� �ٲ۴�.
 * run() �� ����ǰ�, ������ 2�� ���
 * 
 */
