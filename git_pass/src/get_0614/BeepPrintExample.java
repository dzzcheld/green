/*

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {

		Toolkit toolkit=Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}

		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
/*메인 스레드만 이용한 경우
 * (메인 메소드 실행하면서 시작됨, 코드의 실행 흐름)
 
 *객체를 생성하여, Toolkit 타입의 변수에 저장
 *(getDefaultToolkit 는 Toolkit 객체를 얻는다, 메모리 할당, Toolkit 필드 사용가능함.)
 *
 *반복문
 *toolkit.beep();
 *(Toolkit 타입을 사용하여 beep 메소드를 사용함, 비프음 발생)
 *try {Thread.sleep(500);}catch(Exception e) {}
 *(Thead 에서 sleep 메소드 호출, 0.5 초간 일시 정지)
 *
 *반복문
 *"띵" 출력
 *0.5 초간 일시 정지
 *
 *
 */
 