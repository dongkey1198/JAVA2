package inheritance_Practice;

class Fruit{
	protected String name;
	
	protected Fruit() {
		System.out.println("과일");
	}
	
	public Fruit(String name) {
		this.name = name;
	}
	
	public void fruiter() {
		System.out.println(name);
	}
}

class Apple extends Fruit{
	
	private String flavor;
	
	public Apple(String name, String flavor) {
		super(name);
		this.flavor = flavor;
	}

	@Override
	public void fruiter() {
		System.out.println("사과 나무");
	}
	
	public String toString() {
		return "name= " + name + " 맛: " + flavor;
	}
	
}

public class InheritanceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit b = new Fruit("사과나무");
		b.fruiter();
		
		Apple a = new Apple("사과:홍옥", "상큼한맛");
		a.fruiter();
		System.out.println(a);
	}

}
