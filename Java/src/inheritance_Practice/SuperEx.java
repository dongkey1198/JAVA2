package inheritance_Practice;

class A{
	int vi;
	String vs;
	
	public A() {
		vi = 5;
		vs ="Java";
	}
	
	public A(String vs) {
		this();
		this.vs = "I Can do it.";
	}
	
	public A(int vi, String vs) {
		this(vs);
		this.vi = vi;
	}
}

class B extends A{
	int ve;
	public B(){
		super();
		ve = 88;
	}
	
	public B(String str) {
		super(str);
		ve = 77;
	}
	
	public B(int x, String str) {
		super(x, str);
		ve = 33;
	}
}

public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B object = new B();
		System.out.println(object.ve);
	}

}
