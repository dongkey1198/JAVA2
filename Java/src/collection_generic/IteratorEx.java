package collection_generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj = new ArrayList<String>();
		String[] seasons = {"Spring","Summer","Fall","Winter"};
		
		for(int i = 0; i< seasons.length; i++) {
			obj.add(seasons[i]);
		}
		
		obj.add("C");
		obj.add("A");
		obj.add("N");
		
		Iterator<String> itr = obj.iterator();
		
		System.out.println("#1 iterator loop: ");
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		//for루프
		System.out.println("#2 for loop: ");
		for(int i = 0; i <obj.size(); i++) {
			System.out.print(obj.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("#3 Advanced for loop: ");
		for(String al : obj) {
			System.out.print(al + " ");
		}
		System.out.println();
		
		System.out.println("#4 while loop: ");
		int j = 0;
		while(j < obj.size()) {
			System.out.print(obj.get(j) + " ");
			j++;
		}
		System.out.println();
		
		ListIterator<String> litr = obj.listIterator();
		while(litr.hasNext()) {
			litr.set(litr.next()+" ");
		}
		System.out.println("Previous Index : "+litr.nextIndex());
		System.out.println("Next Index : " + litr.nextIndex());
		
		System.out.println("ListIterator 요소: ");
		itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		while(litr.hasPrevious()) {
			System.out.print(litr.previous() +" ");
		}
		
		
	}
	
	

}
