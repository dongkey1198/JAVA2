package class_study;

public class ConstructorEx2 {
	
	String name;
	int age;
	
	ConstructorEx2(){}
	
	ConstructorEx2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name: " + name + "\tage :" + age;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx2 c = new ConstructorEx2("홍길동", 20);
	
			
		System.out.println(c);

	}

}
