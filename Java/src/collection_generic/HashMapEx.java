package collection_generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {
	
	public static void printMap(Map mp) {
		Iterator it = mp.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			it.remove();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("이름", "홍길동");
		map.put("나이", "20");
		map.put("주소", "경기도 부천시");
		
		if(map.containsKey("이름")) {
			System.out.println(map.get("이름"));
		}
		
		System.out.println("#1");
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.print(key +":" + map.get(key) + "| ");
		}
		
		System.out.println();
		System.out.println("#2");
		for(Map.Entry<String, String> e : map.entrySet()) {
			System.out.print(e.getKey() + ":" +e.getValue() +"| ");
		}
		
		System.out.println();
		System.out.println("#3");
		for(String key : map.keySet()) {
			System.out.print(key + ":" + map.get(key) +"| ");
		}
		
		for(String value: map.values()) {
			System.out.print(value + ", ");
		}
		
		System.out.println();
		System.out.println("#4");
		
		Object[] ar = map.keySet().toArray();
		for (int i = 0; i < ar.length; i++) {
			String key = (String)ar[i];
			System.out.print(key + ":" + map.get(key) +"| ");
		}
	}

}
