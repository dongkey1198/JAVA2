package stream;

import java.util.stream.IntStream;

public class MatchExmple {

	public static void main(String[] args) {
		
		IntStream stream1 = IntStream.of(10, 20, 30, 40, 50);
		IntStream stream2 = IntStream.of(10, 20, 30, 40, 50);
		IntStream stream3 = IntStream.of(10, 20, 30, 40, 50);
		
		System.out.println(stream1.anyMatch(n -> n > 40));
		System.out.println(stream2.allMatch(n -> n < 60));
		System.out.println(stream3.noneMatch(n -> n < 10));

	}

}
