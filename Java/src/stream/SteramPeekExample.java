package stream;

import java.util.stream.IntStream;

public class SteramPeekExample {

	public static void main(String[] args) {
		
		IntStream stream = IntStream.of(7,8,5,4,2,1,9,7,8,5);
		
		stream.peek(s -> System.out.println("원본 스트림: " + s))
		.skip(2)
		.peek(s -> System.out.println("skip(2) => " + s))
		.limit(5)
		.peek(s -> System.out.println("limit(5) => " + s))
		.sorted()
		.peek(s -> System.out.println("sorted() => " + s))
		.forEach(n -> System.out.println(n));

	}

}
