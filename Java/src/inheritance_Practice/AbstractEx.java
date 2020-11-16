package inheritance_Practice;

abstract class AA{
	
	public abstract String methodT();
	
	public void methodF() {
		System.out.println("Java");
	}
}

class BB extends AA{

	@Override
	public String methodT() {
		return "I can do it";
	}
	
}

public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB obj = new BB();
		System.out.println(obj.methodT());
	}

}
