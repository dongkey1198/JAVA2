package stream;

import java.util.stream.IntStream;

public class CountExample {

	public static void main(String[] args) {
		 
		IntStream stream1 = IntStream.of(10,20,30,40,50);
		IntStream stream2 = IntStream.of(10,20,30,40,50);
		IntStream stream3 = IntStream.of(10,20,30,40,50);
		
		System.out.println(stream1.count());
		System.out.println(stream2.max().getAsInt());
		System.out.println(stream3.min().getAsInt());

	}

}
