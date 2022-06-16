package git_pass;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin>coinBox=new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.empty()) {
			Coin coin = coinBox.pop();
			System.out.println("������ ���� : " + coin.getValue() + "��"); 
		}
	}

}
/*
 * 
 * stack 
 * LIFO �ڷᱸ���� ������ Ŭ����(�ʰ� ���°� ���� ������)
 * push()-�־��� ��ü�� ���ؿ� �ֽ��ϴ�
 * peek()-������ �� �� ��ü�� �����ɴϴ�.��ü�� ���ÿ��� �������� �ʽ��ϴ�.
 * pop()-������ �� �� ��ü�� �����ɴϴ�.��ü�� ���ÿ��� �����մϴ�.
 * isEmpty()-���ڿ��� empty String ���� üũ��(���ڿ� ���̰� 0�� ���, true �� �����մϴ�.)
 * (isBlank�� ���ڿ��� ��� �ְų�, �� �������θ� �̷���� ������, true �� �����մϴ�.)
 * 
 * Stack ��ü ������, ������ ��ü Ÿ���� �̸� E Ÿ�� �Ķ���� �ڸ��� ǥ���ϰ� �⺻ �����ڸ� ȣ��.
 * 
 * 
 * ???
 * -new Coin() ���ڰ��� �Ű������� int ���ε�, coinBox ���� �� ���ڿ��� ������ �Ǵ°�
 * -isEmpty() �� ��Ʈ�� Ŭ������.
 * -map ���� �ٲ��ش�
 * ==============================================================================
 * <Coin>Ÿ���� ��ü ����, <Coin>Ÿ���� Stack Ŭ������ �ν��Ͻ�ȭ
 * (�޸� ����, Stack Ŭ���� �н� ����� �����ϴ�)
 * 
 * <Coin>Ÿ���� Stack ��ü�� ����� coinBox ������ �־��� ��ü�� ���ؿ� �ִ´�
 * (new Coin()�� �μ����� �ְ�, �� ������ Coin Ŭ���� �ʵ忡 ����ȴ�.)
 * 100(�� �Ʒ�) 50 500 10 ������ ������ ������ �ȴ�.
 * 
 * �ݺ���(���ڿ��� ������� �ʴٸ� ��� �۵��Ѵ�)
 * coninBox ���� ������ �� �� ��ü�� �������� �̸� coin ��ü�� �����Ѵ�(�������� ���ŵ�)
 * coin ��ü���� getValue()�޼ҵ� ȣ��
 * (Ŭ���� �н��� value �� ��ȯ����, private �����ڸ� get ���� ǥ���Ѵ�.)
 * 
 * 
 *  
 * 
 * 
 * 
 * 
 
 
 * 
 */
 