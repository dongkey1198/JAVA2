package class_study;

public class ConstructorEx {
	
	String name;
	int age;
	
	ConstructorEx(){}
	
	
	@Override
	public String toString() {
		return "name: " + name + "\tage :" + age;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx c = new ConstructorEx();
		c.age = 20;
		c.name ="홍길동";
		
		System.out.println(c);
		System.out.println(c.toString());
	}

}
