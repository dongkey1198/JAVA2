package stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindFirstExample {
	
	public static void main(String[] args) {
		
		IntStream stream1 = IntStream.of(9,7,8,6,4,5,2,3,1,0);
		IntStream stream2 = IntStream.of(9,7,8,6,4,5,2,3,1,0);
		
		OptionalInt result1 = stream1.sorted().findFirst();
		System.out.println(result1.getAsInt());
		
		OptionalInt result2 = stream2.sorted().findAny();
		System.out.println(result2.getAsInt());
	}
	
}
