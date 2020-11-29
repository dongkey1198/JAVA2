package stream;

import java.util.stream.Stream;

public class ForEachExample {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("Four", "Three", "Two", "one");
		stream.forEach(s -> System.out.println(s));

	}

}
