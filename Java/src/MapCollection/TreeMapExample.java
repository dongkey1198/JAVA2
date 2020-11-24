package MapCollection;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treemap = new TreeMap<Integer,String>();
		
		treemap.put(30, "삼십");
		treemap.put(10, "십");
		treemap.put(40, "사십");
		treemap.put(20, "이십");
		
		System.out.println(treemap.keySet());
		
		for(Integer key : treemap.keySet()) {
			System.out.print(key + ":"+treemap.get(key)+" ");
		}
		
		System.out.println();
		treemap.remove(40);
		treemap.replace(20, "Twenty");
		
		for(Integer key : treemap.keySet()) {
			System.out.print(key + ":"+treemap.get(key)+" ");
		}
	}

}
