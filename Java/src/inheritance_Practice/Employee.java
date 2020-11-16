package inheritance_Practice;

abstract class Person{
	private String name;
	
	public Person(String nm) {
		this.name = nm;
	}
	
	public abstract void info();
	
	public String toString() {
		return "이름= " + this.name;
	}
}

public class Employee extends Person {
	
	private int empId;
	
	public Employee(String nm, int id) {
		super(nm);
		this.empId = id;
	}
	
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("올해 입사한 신입 사원!!!");
	}
	
	@Override
	public String toString() {
		return super.toString() + ":: 사번= " + empId;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Employee("홍길동", 203000001);
		System.out.println(hong);
		hong.info();
	}



}
