/*package get_0614;

public class BeepPrintExample4 {

	public static void main(String[] args) {
		
		Thread thread=new BeepThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}

	}

}
/*
 * 메인 스레드와 작업 스레드가 동시에 실행
 * (메인 메소드, 분할 작업)
 * 
 * Thread 객체 생성
 * (BeepThread 를 Thread 타입으로 인스턴스화)
 * 
 * thread.start()
 * start메소드는 실행 후에 곧바로 종료된다.
 * 
 * 쓰레드를 실행하는 코드
 * Thread의 서브 클래스를 만들어 run() 메소드를 오버라이딩 한다.
 * run() 메소드는 Thread의 start() 메소드가 호춤됐을 때 실행되는 메소드.
 * 
 * run()
 * Toolkit 의 객체를 얻어, Toolkit 타입의 toolkit 에 저장한다.(인스턴스화)
 * 0.5 초 마다 beep 사운드 5번 반복-
 * 
 * *
 */