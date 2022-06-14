/*package get_0614;


public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		Runnable beepTask=new BeepTask();
		Thread thread=new Thread(beepTask);// 클래스 인스턴스를 쓰레드의 생성자로 전달한다(run())
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}

	}

}
/*	메인 쓰레드와 작업 쓰레드가 등시에 실행
 * (메인 메소드, 각 작업별로 스레드를 생성)
 * Runnable beepTask=new BeepTask();
 * BeepTask 이라는 객체를 , Runnable 타입으로 인스턴스화 한다.
 * (메모리 점유, Runnable 필드를 사용 할 수 있다.)
 *
 * Thread thread=new Thread(beepTask);
 * 인스턴스가 생성될 때 beepTask 의 값을 입력한다
 * Thread 데이터 타입으로 Thread 객체를 인스턴스화 한다.
 * 생성자 thread, Runnable target
 * 
 * thread.start();
 * 새로운 쓰레드가 생성되어 run 메서드를 호출한다.
 * 
 * 
 * start()
 * 이를 실행하면 Thread를 새로 생성하여 start 한다. 
 * start하게되면 run()메서드가 호출된다.
 * 멀티쓰레드로 작동한다.(코드의 완료 여부와 상관없이 아래 코드를 수행한다.)
 * 
 * run()
 * Thread가 생성되지 않으며, 그냥 run()메소드만 실행된다
 * 싱글쓰레드로 동작한다.
 * 
 * Runnable
 * 클래스는 상속받으면 다른 클래스를 상속받을 수 없기에, 
 * 인터페이스인 Runnable 로 구현하는 방법이 일반적이다.(다른 클래스를 상속받기 위해)
 * 
 * 재사용성이 높고 코드의 일관서을 유지할 수 있다.
 * 
 * 
 * 1.쓰레드 생성
 * Thread thread=new Thread(beepTask);
 * 
 * 2.쓰레드 실행
 * thread.start();
 * 실행된 다음 곧바로 종료 된다.
 * 
 * 3.쓰레드 실행 코드(방법)
 * java.lang.Runnable 인터페이스를 구현한 오브젝트를 Thread의 생성자의 파라미터로 남기는 방법.
 
 *4.run() 메소드를 호출하기 위해
 *  BeepTask 클래스의 인스턴스(beeptask)를 Thread의 생성자로 전달한다.
 *
 */
