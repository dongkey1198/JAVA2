package stream;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceExample {

	public static void main(String[] args) {
		
		Stream<String> stream1 = Stream.of("Four", "Three", "Two", "one");
		Stream<String> stream2 = Stream.of("Four", "Three", "Two", "one");
		
		Optional<String> result1 = stream1.reduce((s1, s2)-> s1 + "++" + s2);
		result1.ifPresent(System.out::println);
		
		String result2 = stream2.reduce("Start", (s1, s2) -> s1 +"--" + s2);
		System.out.println(result2);

	}

}
