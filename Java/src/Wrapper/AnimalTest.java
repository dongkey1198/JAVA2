package Wrapper;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal tiger = new Tiger();
		if(tiger instanceof Tiger) {
			tiger = (Tiger)tiger;
		}
		tiger.eat();
		tiger.work();
	}

}
