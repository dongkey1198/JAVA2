package chapter9_Array;

public class ObjectCopy {
	
	public static void main(String[] args) {
		
		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book("태백산맥1", "조정래");
		book[1] = new Book("태백산맥2", "조정래");
		book[2] = new Book("태백산맥3", "조정래");
		book[3] = new Book("태백산맥4", "조정래");
		book[4] = new Book("태백산맥5", "조정래");
		
		System.arraycopy(book, 0, copyBook, 0, 5); // 얕은 복사 주소값을 복사하는 것이기때문에 값이 변하면 복사한 객체 배열의 값도 수정된다. 
		
		for(Book book1: copyBook) {
			book1.showBookInfo();
		}
		
		book[0].setTitle("나목");
		book[0].setAuthor("박완서");
		
		for(Book b : book) {
			b.showBookInfo();
		}
		
		System.out.println("====================");
		
		for(Book b : copyBook) {
			b.showBookInfo();
		}
	}
}
