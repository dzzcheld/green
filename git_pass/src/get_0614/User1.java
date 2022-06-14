package get_0614;

public class User1 extends Thread{
	private Calculator calculator;
	
	public void setCalcculator(Calculator calculator) {
		System.out.println("1");
		this.setName("User1");
		this.calculator=calculator;
	}
	
	public void run() {
		System.out.println("2");
		calculator.setMemory(100);
	}

}
