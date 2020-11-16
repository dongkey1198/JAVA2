package inheritance_Practice;

class Sub extends Object{
	void info() {
		System.out.println("서브 클래스");
	}
	
	public String toString() {
		return "업캐스팅된 것을 원래대로 다운캐스팅";
	}
}


public class UpDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Sub();
		((Sub) obj).info();
		
		if(obj instanceof Sub) {
			Sub a = (Sub) obj;
			System.out.println(a);
		}
		else {
			System.out.println("다입이 일치하지 않습니다");
		}
	}

}
