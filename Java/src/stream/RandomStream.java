package stream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RandomStream {

	public static void main(String[] args) {
		
		IntStream stream = new Random().ints(2);
		DoubleStream stream2 = new Random().doubles(2);
		LongStream stream3 = new Random().longs(2);
		
		stream.forEach(i -> System.out.println(i));
		System.out.println();
		stream2.forEach(i -> System.out.println(i));
		System.out.println();
		stream3.forEach(i -> System.out.println(i));
		
	}
}
