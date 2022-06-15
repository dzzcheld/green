package get_0615;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer>map=new HashMap<String, Integer>();
		
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);
		System.out.println("�� Entry ��: " + map.size());
		
		System.out.println("\tȫ�浿 :" + map.get("ȫ�浿"));
		System.out.println();
		
		Set<String>keySet=map.keySet();
		Iterator<String>keyIterator=keySet.iterator();
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();
		
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��: " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
		Iterator<Map.Entry<String, Integer>>entryiterator=entrySet.iterator();
		
		while(entryiterator.hasNext()) {
			Map.Entry<String, Integer> entry=entryiterator.next();
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println("\t" + key + ":" + value);
			
		}
		System.out.println();
		
		map.clear();
		System.out.println("�� Entry ��: " + map.size());
	}
	
}
/*
 * 
 * <String, Integer> Ÿ�� HashMap ��ü�� MapŬ���� <String, Integer> Ÿ������ �ν��Ͻ�ȭ
 * (�޸� ����, Map Ŭ���� �н� ���)    
 * 
 * map ������ 
 * key, value ���� �����Ѵ�.
 * 
 * map size(3)�� ����Ѵ�.
 * ȫ�浿 90 �� ȫ�浿 95 �� �� ���δ�.
 * 
 * value ���� �����Ѵ�
 * 3�� ����
 * 
 * map���� key���� ����� ��ü�� Set Ŭ���� <String> Ÿ������ �ν��Ͻ�ȭ 
 * (Set Ŭ���� �н� ��밡��, �޸� ����)
 * map�� Ű ���� ����� �ִ� ��ü�� �ҷ��� �̸� Iterator Ŭ����, <String> ������ �ν��Ͻ�ȭ �Ͽ�
 * ketIterator �� �����Ѵ�.
 * 
 * �ݺ���
 * ��ü�� �������� ����(���� ���� ��)
 * ��ü�� ���� String Ÿ������ ��ȯ�Ͽ� ����
 * String Ÿ������ ���� �Ű����� key�� �����Ͽ� Integer �� ������ �����Ѵ�.
 * =>
 * key���� key���� ����, get(key)�� value
 * 
 * ȫ�浿 ��ü ����, (size 2�� �پ����)
 * Ű�� ���� ������ ������ ��� Map.Entry ��ü�� Set�� ��� ����
 * Ű�� ���� 
 * 
 * 
 * ======================================
 * put() ��ü�߰�
 * �־��� Ű�� ���� ������. ���ο� Ű�� ��� null�� ����.
 * ������ Ű�� ���� ��� ���� ���q�� ���� ���� �����Ѵ�.
 * 
 * get()
 * �־��� Ű�� �ִ� ���� �����մϴ�.(�Ű������� Ű������ �޾Ƽ� value�� ��ȯ�Ѵ�)
 * 
 * keySet()
 * key���� ���
 * 
 * entrySet()
 * key, value ��� ���
 * 
 * next()
 * ���� �����͸� ��ȯ 
 * 
 * Set<Map.Entry<K.V>>entrySet()
 * Ű�� ���� ������ ������ ��� Map.Entry ��ü�� Set�� �㿡�� �����մϴ�.
 * 
 */
