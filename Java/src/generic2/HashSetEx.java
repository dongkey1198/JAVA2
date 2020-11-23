package generic2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("이");
		hs.add("김");
		hs.add("박");
		hs.add("이");
		
		for(String a : hs) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("김");
		hs2.add("이");
		hs2.add("이");
		hs2.add("박");
		
		//iterator() 메서드를 이용한 요소의 출력
		Iterator<String> it = hs2.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("hs의 크기: "+hs.size());
		System.out.println("hs2의 크기: "+hs2.size());
	}

}
