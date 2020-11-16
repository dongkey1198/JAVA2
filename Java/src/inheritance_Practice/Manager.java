package inheritance_Practice;

public class Manager extends Employee2{
	
	private String job;
	
	public Manager() {}
	
	public Manager(String name, String address, String telephone, String job) {
		super(name, address, telephone);
		this.job = job;
	}

	@Override
	public String toString() {
		return name + " " + address + " " + telephone + " " + job;
	}
}
