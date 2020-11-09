package class_study;

public class ThisEx {
	String name;
	int age;
	
	ThisEx(){
		this("홍길동"); //ThisEx(String) 호출
	}
	
	
	ThisEx(String name){
		this(name, 25);
		this.name = name;
	}
	
	ThisEx(int age){
		this.age = age;
	}
	
	ThisEx(String name, int age){
		this.name = name;
		this.age =age;
	}
	
	
	
	@Override
	public String toString() {
		
		return "ThisEx: [name=" + name + ", age=" + age + "]";
	}


	public static void main(String[] args) {
		
		ThisEx obj = new ThisEx("홍길동", 20);
		ThisEx obj2 = new ThisEx("홍길동");
		ThisEx obj3 = new ThisEx(20);
		
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj3);

	}
	public static void redTrun() {
		
	}

}
