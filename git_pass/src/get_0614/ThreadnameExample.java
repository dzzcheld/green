package get_0614;

public class ThreadnameExample {

	public static void main(String[] args) {
		
		Thread mainThread=Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름:" + mainThread.getName());
		
		ThreadA threadA=new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB=new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
	}

}
/*
 * 메인 thread
 * main 이름을 가지며, setName()로 이름이 변경가능, getName() 메소드로 Thread 이름을 알 수 있음.
 * 
 * Thread mainThread=Thread.currentThread();
 * 현재 실행중인 쓰레드 객체를 리턴한다. 쓰는 이유 
 * 
 * mainThread.getName()
 * mainThread 의 이름을 알 수 있음.
 * 
 * Thread A 를 데이터타입 ThreadA로 인스턴스화 한다.
 * getName() 메소드를 사용해 ThreadA의 이름을 알 수 있다.
 * ThreadA에서 (데이터 타입) start 메소드를 호출한다.
 * 
 * start()
 * 실행되면 곧 바로 종료되는데, 
 * Thread의 서브 클래스를 만들어 run() 메소드를 오버라이딩 한다.
 * run() 메소드는 Thread의 start() 메소드가 호춤됐을 때 실행되는 메소드.
 * 
 * 서브 클래스인 ThreadA
 * setName으로 threadA의 이름을 "ThreadA"로 바꾼다.
 * run() 가 실행되고, 문구가 2번 출력
 * 
 */
