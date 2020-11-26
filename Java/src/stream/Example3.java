package stream;

import java.util.stream.Stream;

public class Example3 {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 3, d = 4;
		Stream<Integer> stream = Stream.of(a,b,c,d);
		stream.forEach(i -> System.out.println(i));
	}

}
