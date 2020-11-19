package collection_generic;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>  arrayList = new ArrayList<String>();
		
		arrayList.add("Java");
		arrayList.add("Oracle");
		arrayList.add("Sun");
		
		System.out.println("#1리스트 요소: " + arrayList);
		
		arrayList.add(0, "DB");
		arrayList.add(1, "C++");
		System.out.println("#2 리스트 요소:" + arrayList);
		
		if(arrayList.contains("C++")) {
			System.out.println("yes");
		}
		
		Collections.sort(arrayList);
		
	}

}
