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
			System.out.println("��");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
/*���� �����常 �̿��� ���
 * (���� �޼ҵ� �����ϸ鼭 ���۵�, �ڵ��� ���� �帧)
 
 *��ü�� �����Ͽ�, Toolkit Ÿ���� ������ ����
 *(getDefaultToolkit �� Toolkit ��ü�� ��´�, �޸� �Ҵ�, Toolkit �ʵ� ��밡����.)
 *
 *�ݺ���
 *toolkit.beep();
 *(Toolkit Ÿ���� ����Ͽ� beep �޼ҵ带 �����, ������ �߻�)
 *try {Thread.sleep(500);}catch(Exception e) {}
 *(Thead ���� sleep �޼ҵ� ȣ��, 0.5 �ʰ� �Ͻ� ����)
 *
 *�ݺ���
 *"��" ���
 *0.5 �ʰ� �Ͻ� ����
 *
 *
 */
 