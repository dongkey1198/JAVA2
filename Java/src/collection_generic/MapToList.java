package collection_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		HashMap<String,ArrayList<String>> multiMap = new HashMap<String, ArrayList<String>>();
		
		hashmap.put("C", 12);
		hashmap.put("A", 88);
		hashmap.put("N", 55);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("sun");
		list.add("moon");
		multiMap.put("planet", list);
		
		Set<Entry<String, ArrayList<String>>> setMap = multiMap.entrySet();
		
		

	}

}
