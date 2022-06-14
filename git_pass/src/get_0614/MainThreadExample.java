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
 * Calculator 클래스를 Calculator 데이터 타입으로 인스턴스화
 * (메모리 할당, Calculator 필드사용)
 * 
 * User1 클래스를 데이터 타입 User1 로 인스턴스화
 * (메모리 할당, User1 필드 사용)
 * 
 * user1 에서 setCalculator 메소드를 인수 calculator으로 호출 한다.
 * 
 * calculator이 인수로 들어와 필드에 저장된다.
 * setName()으로 인해 이름이 해당 필드에 저장된다(User 1)
 * 
 * run()
 * setMemory를 통해 100을 저장한다.
 * 
 * setMemory
 * 
 * *
 */