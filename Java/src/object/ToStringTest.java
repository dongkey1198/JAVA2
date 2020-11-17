package object;


class Book implements Cloneable{
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
		return "제목: " + title + "/ 저자: " + author;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}

public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Book book = new Book("토지", "박경리");
		System.out.println(book);
		
		String str = new String("토지");
		System.out.println(str.toString());
		
		Book book2 = (Book)book.clone();
		System.out.println(book2);
		
		System.out.println(book == book2);
	}

}
