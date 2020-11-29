package stream;



import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectExample {

	public static void main(String[] args) {
		
		Stream<String> stream1 = Stream.of("Four", "Three", "Two", "One");
		
		List<String> list = stream1.collect(Collectors.toList());
		
		for(String s : list) {
			System.out.println(s);
		}


	}

}
