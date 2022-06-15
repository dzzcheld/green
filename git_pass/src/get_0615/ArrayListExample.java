package get_0615;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DataBase");
		list.add("iBATIS");
		
		int size=list.size();
		System.out.println("�� ��ü��: " + size);
		System.out.println();
		
		String skill=list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str=list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String str=list.get(i);
			System.out.println(i + ":" + str);
		}
		
	}

}

/*
 *ArrayList<String> Ÿ���� ��ü�� List Ŭ���� <String> Ÿ������ �ν���ȭ �Ͽ� list�� ����
 *(�޸� ����, List Ŭ���� �н� ��� ����)
 *
 *list.add() 
 *�־��� ��ü�� �� ���� �߰��մϴ�. 
 *
 *list.add(2, "DataBase");
 *������ �ε����� ��ü ����
 *Java, JDBC, DataBase, Servlet/JSP, iBATIS ������� ��ü�� �����.
 *
 *size()
 *����Ǿ� �ִ� ��ü ��ü ���� �����Ѵ�.
 *
 *get()
 *�־��� �ε����� ����� ��ü�� �����մϴ�
 *2�� �ε����� ����� ��ü�� DataBase �� �����Ѵ�.
 *
 *remove()
 *�־��� �ε����� ����� ��ü�� �����մϴ�.
 *2�� �ε����� DataBase ����, �� �������� 2�� �ε����� �� Servlet/JSP ����
 *iBATIS ����
 *
 *=?
 *Java, JDBC �� ��µȴ�.
 *
 * =======================================
 * 
 * List �÷���
 *
 * ��ü�� �ε����� ����
 * ����뷮�� �ڵ����� �����ϸ� ��ü ���� �� �ڵ� �ε����� �ο�
 * ��ü ��ü�� �����ϴ� �� �Ӹ� �ƴ϶� ��ü������ �����ϴ� �͵� �����ϴ�.
 * ��ü �����ϴ� ��� �ٷ� �� �ε������� ������ �ε������� ��� ������ 1�� �����
 * 
 */
