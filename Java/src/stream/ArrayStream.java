package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStream {
	
	public static void main(String[] args) {
		
		String[] arr = {"one","two","three", "four"};
		
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		Stream<String> stream2 = Arrays.stream(arr, 1, 3);
		stream2.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		int[] arr2 = {1,2,3,4};
		IntStream stream3 = Arrays.stream(arr2);
		stream3.forEach(i -> System.out.print(i + " "));
	}
	
}
