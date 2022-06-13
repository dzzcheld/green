package git_pass;

abstract class Calculator{
	int left, right;
	public void setOperands(int left, int right) {
		this.left=left;
		this.right=right;
	}
	
	int _sum() {
		return this.left + this.right;
	}
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum();
		avg();
	}
}

class CalculatorDecoPlus extends Calculator {
	
	public void sum() {
		System.out.println(" + sum : "+_sum());
	}
	
	public void avg() {
		System.out.println(" + avg : " +(this.left + this.right)/2 );
}

}

class CalculatorDecoMinus extends Calculator{
		
		public void sum() {
			System.out.println(" - sum : " + _sum());
		}
		
		public void avg() {
			System.out.println(" - avg : " +(this.left + this.right)/2 );
	}


} 


public class Test_6 {

	
	
	public static void main(String[] args) {
		
		Calculator c1=new CalculatorDecoPlus();
		c1.setOperands(10, 20);
		c1.run();
		
		Calculator c2=new CalculatorDecoMinus();
		c2.setOperands(10, 20);
		c2.run();
		
		execute(c1);
		execute(c2);
		
				}
	public static void execute(Calculator cal) {
		System.out.println("실행결과");
		cal.run();

	}

}

/*
   execute 메소드는 CalculatorDecoPlus 와 CalculatorDecoMinus 클래스의
 * 메소드 run을 호출하면서 그것이 '실행결과'라는 사실을 화면에 표시하는 기능을 가지고 있다.
 * 이 때 메소드 execute 내부에서는 매개변수로 전달된 객체의 메소드 run을 호출하고 있다.
 * 
 * *
 */