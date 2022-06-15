package get_0615;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String>list1=new ArrayList<String>();
		List<String>list2=new ArrayList<String>();
		
		long startTime;
		long endTime;
		
		startTime=System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime=System.nanoTime();
		System.out.println("ArrayList �ɸ��ð�: " + (endTime-startTime) + "ns");
		
		endTime=System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("LinkedList �ɸ��ð� : " + (endTime-startTime) + "ns7");
		
	}

}

/*
 * ArrayList<String> ��ü�� List Ŭ���� <String> Ÿ������ �ν��Ͻ�ȭ �� list1, list2 �� ����
 * (�޸� ����, List�� Ŭ���� �ʵ带 ��� �� �� �ִ�)
 * 
 * long Ÿ���� ���� startTime, endTime �� �����Ѵ�.
 * 
 * startTime ������ �ð����� ��������� ��ȯ�ϴ� �޼ҵ带 ������
 * list1��ü 0�� �ε����� 0~9999������ ���ڿ��� �����Ѵ�.
 * -System.nanoTime();
 * ���� JVM�� �ð����� ������ ��ȯ�ϴ� �޼���
 * ���� ����� �ð��� �����ϴµ� ���, �ý����̳� �Ⱒ���� �ƹ��� �������� ������ ����.
 * -String.valueOf()
 * ��ü�� String ���ڿ� ���� �ڷ������� �� ��ȯ�ϴ� ������ �Ѵ�.
 * ���޹��� �Ķ���Ͱ� null�� ��� ���ڿ� "null"�� ��ȯ�Ѵ�.

 *endTime �� System.nanoTime()�޼��带 �����Ͽ� ���� JVM�� �ð����� ������ ��ȯ�ϰ� �����Ѵ�.
 *ArrayList ���� 0~9999���� ������ �ð�
 *
 *LinkedList ���� 0~9999���� ������ �ð�
 *
 *=>
 *ArrayList, LinkedList �ӵ� List�������̽��� ������ collection ����ü�̴�.
 *�������̽��� ���� ���������� �����ϴ� ����� �ٸ���.
 *
 *ArrayList
 *-���������� �����͸� �迭���� �����ϸ� �������� �߰�, ������ ����
 * �Ʒ��� ���� �ӽ� �迭�� ������ �����͸� ���� �ϴ� ����� ����Ѵ�.
 *(���簡 ���� �Ͼ�� �������ϸ� ����ų �� ������, �� ������ �˻����� �����ϴ�)
 *
 *LinkedList
 *-�������� �߰�, ������ ���ʿ��� �������� ���簡 ����(�ӽ� �迭�� �������� ����)
 *�������� �߰�, �����ÿ� �����ϴ�.
 *�˻��ÿ��� ó������ ��带 ��ȸ�ؾ� �ϱ� ������ ���ɻ� �Ҹ��ϴ�.
 *
 *=>
 *get/set�� ArrayList
 *ó���̳� ���� ���� ����, ������ LinkedList
 *
 */
