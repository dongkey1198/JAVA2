package collection_generic;

import java.awt.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> dll = new LinkedList<String>();
		
		dll.add("c");
		dll.add("a");
		dll.add("n");
		dll.addLast("Z");
		dll.addFirst("A");
		dll.add(1, "T");
		System.out.println(dll);
		
		dll.add(0, "beer");
		System.out.println(dll);
		
		Iterator<String>  itr = dll.iterator();
		while(itr.hasNext()) {
			System.out.print( itr.next()+ " ");
		}
		System.out.println();
		
		dll.remove(2);
		dll.removeFirst();
		dll.removeLast();
		
		System.out.println(dll);
		
		for(int i = 0; i < dll.size(); i++) {
			System.out.print(dll.get(i) + " ");
		}
		System.out.println();
		
		java.util.List<String> subList = dll.subList(3, dll.size());
		
		System.out.println("index 3 부터 " + dll.size() + ": " +subList);
		
		Collections.sort(dll);
		System.out.println(dll);
		
		Collections.reverse(dll);
		System.out.println(dll);
		
		Object[] arr = dll.toArray();
		
		dll.clear();
		System.out.println(dll);
		
		
	}

}
