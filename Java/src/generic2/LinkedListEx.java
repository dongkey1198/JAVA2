package generic2;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("four");
		list.add("three");
		list.add("two");
		list.add("one");
		
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		list.remove(1);
		
		for(String e : list) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		list.set(2, "two");
		
		for(String e : list) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		System.out.println(list.size());

	}

}
