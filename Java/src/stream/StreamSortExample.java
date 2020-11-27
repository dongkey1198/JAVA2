package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSortExample {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("bbb", "ccc", "aaa","eee", "ddd");
		stream.sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		Stream<String> stream2 = Stream.of("bbb", "ccc", "aaa","eee", "ddd");
		stream2.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
	}

}
