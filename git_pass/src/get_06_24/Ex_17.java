package get_06_24;

import java.util.Scanner;


public class Ex_17 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("x���� �Է��Ͻÿ�:");
		int x=in.nextInt();
		
		System.out.print("y���� �Է��Ͻÿ�:");
		int y=in.nextInt();
		
		
		System.out.print(x +" ��"+ y +" ���� " + (int)Math.pow(x, y) );

	}

}
/*
 * 
 * [����17] for���� �̿��Ͽ� �������� ���Ͻÿ�

x�� ���� �Է��Ͻÿ� : 3
y�� ���� �Է��Ͻÿ� : 3
3�� 3���� 27
��ó: https://private.tistory.com/13 [�����ؼ� �� ����:Ƽ���丮]
 * 
 * scanner ��ü ���� �� 
 * nextInt()�� �����ϱ�
 * 
 * Math.pow()
 * 
 */
