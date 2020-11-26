package stream;

import java.util.ArrayList;
import java.util.List;

class TravelCustomer{
	private String name;
	private int age;
	private int price;
	
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return name + ", " + age +", " + price;
	}
	
}

public class Practice1 {

	public static void main(String[] args) {
		
		TravelCustomer Lee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer Kim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer Hong = new TravelCustomer("홍길동", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(Lee);
		customerList.add(Kim);
		customerList.add(Hong);
		
		System.out.println(customerList);
		
		customerList.stream().map(c-> c.getName()).forEach(s -> System.out.println(s));
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		
		System.out.println();
		
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName())
		.sorted().forEach(s->System.out.println(s));

	}

}
