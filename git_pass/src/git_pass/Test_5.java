package git_pass;
/*
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


public class Test_5 {

	public static void main(String[] args) {
		
		Calculator c1=new CalculatorDecoPlus();
		c1.setOperands(10, 20);
		c1.run();
		
		Calculator c2=new CalculatorDecoMinus();
		c2.setOperands(10, 20);
		c2.run();

	}

}

/*CalculatorDecoPlus 클래스는 데이터 타입 Calculator로 인스턴스화.
 *(메모리 할당, Calculator 클래스 필드 사용 가능)
 *
 *c1에서 setOperands 메소드 호출(인자는 10, 20)
 *Calcluator 추상 클래스(상속하여 재정의 해야됨)
 *-setOperands 메소드에서 매개변수를 상속 클래스 필드에 저장한다.
 *-_sum 메소드는 필드 변수끼리 더 하여 리턴한다.
 *-추상 메소드 sum, avg 호출
 *-run 메소드에서 sum, avg 메소드 호출.
 *
 *10,20이 매개변수로 들어와 추상 클래스 필드에 저장.
 *
 *메인에서 run()메소드를 통해, CalculatorDecoPlus 에서 추상 메소드 sum, avg를 재정의함.
 *+ sum : 30, + avg : 15 출력 후 반환
 *
 *
 *c2도 동일함
 *(CalculatorDecoMinus)
 * 
 * =>
 * Calculator를 상속받은 클래스들을(CalculatorDecoPlus, CalculatorDecoMinus)
 * 인스턴스화 할 때 Calculator를 데이터 타입으로 하고 있다.
 * 인스턴스 c1과 c2를 사용하는 입장에서 두개의 클래스 모두 Calculator인 것처럼 사용할 수 있다.
 * 
 * 
 * *
 */
 