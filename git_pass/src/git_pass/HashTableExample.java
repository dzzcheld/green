package git_pass;

import java.util.*;

public class HashTableExample {

	public static void main(String[] args) {
		
		Map<String, String>map=new Hashtable<String, String>();
		
		map.put("spring","12" );
		map.put(" summer","123" );
		map.put(" fall", "1234");
		map.put("winter ","12345" );
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("�ƾƵ�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵�: ");
			String id=scanner.nextLine();
			
			System.out.print("��й�ȣ :");
			String password=scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��εǾ����ϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				} 
					
				}else {
					System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}

	}

}
/*
 *<String, String> Ÿ���� ��ü Hashtable �� <String, String>Ÿ�� Map Ŭ������ �ν��Ͻ�ȭ
 *(�޸� ����, map Ŭ������ Ŭ���� �ʵ� ��밡��)
 *
 * map �� <String,String>������ ket ���� value ���� ����
 * 
 * Scanner ��ü ����(Ű����κ��� ������ ����) ,Scanner Ŭ������ �ν��Ͻ�ȭ �Ѵ�
 * (Scanner Ŭ���� �ʵ� ���, �޸� ����, Ű����κ��� ������ ���� �� ����)
 * 
 * ���͸� ġ�� ������ �� ���ڿ��� �����Ͽ� String �� id �� �����Ѵ�.
 * 
 * ���� id�� Ű ���� �ִٸ� ��� ����
 * ���� ���� id�� password �� ��ġ�ϸ�(id �� password�� ��ġ�ϸ�)
 * �α��εǾ����ϴ� ��� �� 
 * break;
 * 
 * ============================================================================
 * 
 * nextLine()
 * ���͸� ġ�� ������ �� ���ڿ��� ��� �����Ѵ�.
 * 
 * next()
 * �� �ܾ ���� ������ ����Ѵ�.
 * 
 * containsKey()
 * �ɿ� Ű ���� �ִ��� Ȯ��
 * 
 * get() 
 * map �ȿ� ���� ��ȸ�Ѵ�.
 * 
 */