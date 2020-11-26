package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		StringConcat concat = (s, v) -> System.out.println(s+ "," + v);
		concat.makeString("Hello", "World");
	}

}
