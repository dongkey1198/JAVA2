package generic2;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(30);
		ts.add(40);
		ts.add(20);
		ts.add(10);
		
		for(int e : ts) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		ts.remove(40);
		
		Iterator<Integer> iter = ts.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		//size() 메서드를 이용한 요소의 총개수
		System.out.println(ts.size());
		
		//subSet() 메서드를 이용한 부분 집합의 출력
		System.out.println(ts.subSet(10, 20));
	}

}
