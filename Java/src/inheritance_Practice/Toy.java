package inheritance_Practice;

public class Toy extends Goods{
	
	private String type;
	
	public Toy() {}
	
	public Toy(String name, double price, String type) {
		super(name, price);
		this.type = type;
	}
	
	@Override
	public double getIncome() {
		// TODO Auto-generated method stub
		return price + tax();
	}

	@Override
	public double tax() {
		return price * taxRate;
	}

	@Override
	public String toString() {
		return name + "의 가격은 " + getIncome() + " 입니다.";
	}
	
	
	

}
