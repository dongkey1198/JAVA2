package review;

class Book implements Cloneable {
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class ToStringTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book book = new Book("토지", "박경리");
		System.out.println(book);
		
		Book book2 = (Book)book.clone(); 
		System.out.println(book2);
		
		Integer obj = new Integer("1");
		System.out.println(obj);
		System.out.println(obj+2);
		
		String s = "11";
		int ss = Integer.parseInt(s);
		String a = String.valueOf(ss);
		
	}
}
