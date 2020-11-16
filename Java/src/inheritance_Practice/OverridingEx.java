package inheritance_Practice;

class Human{
	public void move() {
		System.out.println("인간이 움직인다.");
	}
}

class Boy extends Human{

	@Override
	public void move() {
		super.move();
		System.out.println("소년이 움직인다.");
	}
	
}

public class OverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human a = new Human();
		a.move();
		Human b = new Boy();
		b.move();
		Boy c = new Boy();
		c.move();
	}

}
