package get_0615;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("JAVA");
		set.add("iBATIS");
		
		int size=set.size();
		System.out.println("�� ��ü��: " + size);
		
		Iterator<String>iterator=set.iterator();
		while(iterator.hasNext()) {
			String element=iterator.next();
			System.out.println("\t " + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("�� ��ü��:" + set.size());
		
		iterator=set.iterator();
		for(String element: set) {
			System.out.println("\t" + element);
		}
		set.clear();
		if(set.isEmpty()) {System.out.println("��� ����");}

	}

}
/*
 * set �÷���
 * -���� ���� �������� �ʴ´�
 * -��ü �ߺ��Ͽ� ������ �� ���� �ϳ��� null�� ���� �� �� �ִ�.
 * 
 * <HashSet>
 * =set �������̽��� ���� Ŭ����
 * =�⺻ ������ ȣ���Ͽ� ����
 *====================================================== 
 *HashSet<String>��ü�� Set Ŭ����<String>Ÿ������ �ν��Ͻ�ȭ ���Ѽ� set ������ ����
 *(�޸� �Ҵ�, Set Ŭ���� �н� ��밡��)
 *
 *set.add�� ���� �־��� ��ü�� ���� �߰���
 *
 *size()�޼ҵ带 int size�� �����Ѵ�
 *(5�� ����ȴ�)
 *"�� ��ü��: 5" ���
 *
 *set ��ü�� iterator�� ���� �о�ͼ� Iterator Ŭ���� <String>Ÿ�� ������ iterator �� �����Ѵ�.
 *(set��ü�� �о�� iterator �� �����Ѵ�.)
 *
 *(�ݺ���)
 *iterator.hashNext()
 *set���� ��ü�� �����´�, ��ü�� ������ true ������ false
 *��ü�� ������ String Ÿ�� ���� element�� �����Ѵ�.
 *set�� ����� ��ü���� ����Ѵ�. �� 4��
 *
 *Java, Setvlet�� ����
 *size 2
 *
 *set ��Ҹ� �о�� iterator �� ����
 *Java, Setvlet ���� �ΰ� ���
 *
 *set.clear()�� ����� ��ü�� ���� ���� ��
 *set�� ����ִٸ� "������� ���"
 *(isEmpty() ����ִ��� ������
 *
 *
 *========================================================
 *
 *add()
 *�־��� ��ü�� �� ���� �߰��մϴ�,
 *
 *size()
 *����Ǿ� �ִ� ��ü ��ü ���� �����Ѵ�
 *
 *set���� iterator()��ü�� �о���µ� �̸� Iterator Ŭ���� <String> Ÿ������ �ν��Ͻ�ȭ �Ѵ�.
 *(�޸� �Ҵ�, Iterator Ŭ���� �н� ���)
 *iterator.hashNext()�� ���� �о ������ ��ü�� ������ true, ������ false(iterator �������̽� �޼ҵ�)
 *
 *
 *Iterator
 *�ڹ��� �÷��� �����ӿ�ũ(List, Set, Map...)���� �÷��ǿ� ������ �մ� ��ҵ��� �о���� ��� �� �ϳ�.
 *�÷��� �����ӿ�ũ���� ���� ���� �������� ������ �� ����
 *�ܹ��� �ݺ��� ����, ���� ���� �� �߰��� �Ұ��ϰ� �뷮�� ������ ó���� ������
 * 
 * 
 * 
 */
 