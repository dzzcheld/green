package get_0614;

public class MainThreadExample {

	public static void main(String[] args) {
		
		Calculator calculator=new Calculator();
		
		User1 user1=new User1();
		user1.setCalcculator(calculator);
		user1.start();
		
		User2 user2=new User2();
		user2.setCalculator(calculator);
		user2.start();
		

	}

}

/*
 * Calculator Ŭ������ Calculator ������ Ÿ������ �ν��Ͻ�ȭ
 * (�޸� �Ҵ�, Calculator �ʵ���)
 * 
 * User1 Ŭ������ ������ Ÿ�� User1 �� �ν��Ͻ�ȭ
 * (�޸� �Ҵ�, User1 �ʵ� ���)
 * 
 * user1 ���� setCalculator �޼ҵ带 �μ� calculator���� ȣ�� �Ѵ�.
 * 
 * calculator�� �μ��� ���� �ʵ忡 ����ȴ�.
 * setName()���� ���� �̸��� �ش� �ʵ忡 ����ȴ�(User 1)
 * 
 * run()
 * setMemory�� ���� 100�� �����Ѵ�.
 * 
 * setMemory
 * 
 * *
 */