package inheritance_Practice;

public abstract class Goods implements Taxable {
	
	protected String name;
	protected double price;
	
	public Goods() {}
	
	public Goods(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return name + "의 가격은 " + price + " 입니다.";
	}
	
}
