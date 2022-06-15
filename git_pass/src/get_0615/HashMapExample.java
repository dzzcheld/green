package get_0615;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer>map=new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());
		
		System.out.println("\t홍길동 :" + map.get("홍길동"));
		System.out.println();
		
		Set<String>keySet=map.keySet();
		Iterator<String>keyIterator=keySet.iterator();
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		
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
		System.out.println("총 Entry 수: " + map.size());
	}
	
}
/*
 * 
 * <String, Integer> 타입 HashMap 객체를 Map클래스 <String, Integer> 타입으로 인스턴스화
 * (메모리 점유, Map 클래스 패스 사용)    
 * 
 * map 변수에 
 * key, value 값을 저장한다.
 * 
 * map size(3)를 출력한다.
 * 홍길동 90 은 홍길동 95 로 뒤 덮인다.
 * 
 * value 값을 리턴한다
 * 3개 리턴
 * 
 * map에서 key값을 출력한 객체를 Set 클래스 <String> 타입으로 인스턴스화 
 * (Set 클래스 패스 사용가능, 메모리 점유)
 * map의 키 값이 저장되 있는 객체를 불러와 이를 Iterator 클래스, <String> 형으로 인스턴스화 하여
 * ketIterator 에 저장한다.
 * 
 * 반복문
 * 객체를 가져오는 동안(값이 있을 때)
 * 객체의 값을 String 타입으로 변환하여 저장
 * String 타입으로 들어온 매개변수 key를 리턴하여 Integer 형 변수에 저장한다.
 * =>
 * key에는 key값이 저장, get(key)는 value
 * 
 * 홍길동 객체 제거, (size 2로 줄어들음)
 * 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아 리턴
 * 키와 값을 
 * 
 * 
 * ======================================
 * put() 객체추가
 * 주어진 키로 값을 저장함. 새로운 키일 경우 null을 리턴.
 * 동일한 키가 있을 경우 값을 개쳏고 이전 값을 리턴한다.
 * 
 * get()
 * 주어진 키가 있는 값을 리턴합니다.(매개변수를 키값으로 받아서 value로 반환한다)
 * 
 * keySet()
 * key값만 출력
 * 
 * entrySet()
 * key, value 모두 출력
 * 
 * next()
 * 다음 데이터를 변환 
 * 
 * Set<Map.Entry<K.V>>entrySet()
 * 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담에서 리턴합니다.
 * 
 */
