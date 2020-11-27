package stream;

import java.util.stream.IntStream;

public class FilterExample {

	public static void main(String[] args) {
		
		IntStream stream = IntStream.of(8,7,7,8,9,5,4,2,1,3,6);
		
		stream.distinct().forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		IntStream stream2 = IntStream.of(8,7,7,8,9,5,4,2,1,3,6);
		stream2.filter(n -> n%2 != 0).forEach(e -> System.out.print(e + " "));

	}

}
