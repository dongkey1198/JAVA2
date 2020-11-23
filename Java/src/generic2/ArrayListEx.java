package generic2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(40);
		arrList.add(20);
		arrList.add(30);
		arrList.add(10);
		
		//for문을 이용하여 출력:
		for(int i = 0; i<arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
		System.out.println();
		
		//remove() 메서드를 이용한 요소 제거
		arrList.remove(1); //20 제거
		
		//Enhanced for문 사용
		for(int e : arrList) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		//Collection.srot() 메서드를 이용한 요소의 정렬
		Collections.sort(arrList);
		
		//iterator() 메서드와 get() 메서드를 이용한 요소의 출력
		Iterator<Integer> iter = arrList.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		// set() 메서드를 이용한 요소의 변경
		arrList.set(0, 20);
		
		for(int e: arrList) {
			System.out.print(e +" ");
		}
		System.out.println();
		System.out.println(arrList.size());
	}

}
