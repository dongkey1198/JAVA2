package chapter9_ArrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		for(String s : list) {
			System.out.println(s);
		}
		
		ArrayList list2 = new ArrayList();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		for(Object s : list2) {
			System.out.println(s);
		}

		
	}

}
