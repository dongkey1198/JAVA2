package MapCollection;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		
		hashmap.put("value1", 10);
		hashmap.put("value3", 30);
		hashmap.put("value4", 40);
		hashmap.put("value2", 20);
		
		System.out.println(hashmap.keySet());
		
		for(String key : hashmap.keySet()) {
			System.out.print(key + ": " + hashmap.get(key) + "| ");
		}
		System.out.println();
		
		Iterator<String> keys = hashmap.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.print(key + ": " + hashmap.get(key) + "| ");
		}
		System.out.println();
		
		hashmap.replace("value2", 200);
		for(String key : hashmap.keySet()) {
			System.out.print(key + ": " + hashmap.get(key) + "| ");
		}
		System.out.println();
		
		System.out.println(hashmap.size());
		
	}

}
