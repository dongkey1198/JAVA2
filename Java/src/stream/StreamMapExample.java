package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMapExample {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("HTML", "CSS", "JAVA","JAVASCRIPT");
		stream.map(s -> s.length()).forEach(s -> System.out.println(s));
		
		String[] arr = {"I don't ", "like ","your face ", "hahahah "};
		Stream<String> stream2 = Arrays.stream(arr);
		stream2.flatMap(s->Stream.of(s.split(" "))).forEach(s -> System.out.print(s + " "));

	}

}
