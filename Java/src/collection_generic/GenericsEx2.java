package collection_generic;

import java.util.Collection;

class GenericsExx<T>{
	
	private T content;
	
	public GenericsExx(T content) {
		this.content = content;
	}
	
	public T getVar() {
		return this.content;
	}
	
	public void setVar(T t1) {
		this.content = t1;
	}
	
	public String toString() {
		return content + " (" + content.getClass() +")";
	}
	
	public static <T> boolean isEqual(GenericsExx<T> g1, GenericsExx<T> g2) {
		return g1.getVar().equals(g2.getVar());
	}
	
}

public class GenericsEx2 {

	public static void main(String[] args) {
		
		GenericsExx<String> g1 = new GenericsExx<>("Vision");
		System.out.println(g1.getVar());
		
		GenericsExx<String> g2 = new GenericsExx<>("Act");
		System.out.println(g2.getVar());
		
		GenericsExx<Integer> g3 = new GenericsExx<>(88);
		System.out.println(g3.getVar());
		
		GenericsExx<Double> g4 = new GenericsExx<>(8.14);
		System.out.println(g4.getVar());
		
		boolean isEqual = GenericsExx.<String>isEqual(g1, g2);
		System.out.println(isEqual);
		
		

	}

}
