package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamCollection {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(20);
		arrList.add(10);
		arrList.add(40);
		arrList.add(30);
		
		Stream<Integer> stream = arrList.stream();
		stream.forEach(s->System.out.println(s));
		System.out.println();
	
	}

}
