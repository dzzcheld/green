package git_pass;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<Student, Integer>map=new HashMap<Student, Integer>();
		
		map.put(new Student(1,"ȫ�浿"), 95);
		map.put(new Student(1,"ȫ�浿"), 95);
		
		System.out.println("�� Entry ��: " + map.size());
	}

}
/*
 * ���� �κ��� map.put ���� value ���� ����� �� ���� ����.
 * ->Ű�� ������ �����ϴ°� ����(�� ���������� �� ����, ���Ļ�)���� ����
 *Ű���� �׻� �޶�� �Ѵ�. 
 * 
 * 
 * return, hashCode() ���غҰ�
 * hashCode�� Ŭ������
 * ��
 * ==================================================================================
 *<Student,Integer> Ÿ���� HashMap ��ü�� <Student,Integer> Ÿ�� Map Ŭ������ �ν��Ͻ�ȭ
 *(�޸� ����, Map Ŭ���� �н��� ��� �� �� �ִ�.)
 *
 *key �����η�, Student ��ü�� ���ڰ��� 1, "ȫ�浿"
 *value ������, 95 �� �־��ش�.
 *
 *Student Ŭ���� �ʵ忡
 *�Ű� ���� 1, "ȫ�浿"�� ����ȴ�.
 *
 *
 *
 *�Ű����� obj�� Student �� ��ü Ÿ���� ���ٸ�(Object ��)
 *�Ű����� obj�� Student ������ ����ȯ�Ͽ� Student Ÿ���� ��ü student ������ �����Ѵ�.
 *�Ű����� sno �� student�� sno�� ����, �Ű����� name �� student Ŭ���� �ʵ� name�� ��ġ�Ѵٰ� ��ȯ.
 *�ƴ϶�� false�� ��ȯ�Ѵ�.
 *
 *hashCode() �޼ҵ�� 
 *sno �� 
 *
 * =================================================================================
 * map.put()
 * Ű, ���� �ֱ�
 * 
 * Object Ŭ����
 * public boolean equals(Object obj)
 * ��ü �ڽŰ� ��ü obj�� ���� ��ü���� �˷��ش�.
 * 
 * instaceof
 * ��ü Ÿ���� Ȯ���ϴ� ������
 * ����ȯ ���ɿ��� Ȯ��, true Ȥ�� false �� ��ȯ�Ѵ�.
 * 
 * 
 */
