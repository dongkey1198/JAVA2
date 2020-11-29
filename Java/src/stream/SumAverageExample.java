package stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class SumAverageExample {

	public static void main(String[] args) {
		
		IntStream stream1 = IntStream.of(10,20,30,40,50);
		DoubleStream stream2 = DoubleStream.of(2.78, 3.55, 4.235, 5,2148);
		
		System.out.println(stream1.sum());
		System.out.println(stream2.average().getAsDouble());
	

	}

}
