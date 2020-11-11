package chapter9_Array;

public class ObjectCopy2 {
	
	public static void main(String[] args) {
		
		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book("태백산맥1", "조정래");
		book[1] = new Book("태백산맥2", "조정래");
		book[2] = new Book("태백산맥3", "조정래");
		book[3] = new Book("태백산맥4", "조정래");
		book[4] = new Book("태백산맥5", "조정래");
		
		copyBook[0] = new Book();
		copyBook[1] = new Book();
		copyBook[2] = new Book();
		copyBook[3] = new Book();
		copyBook[4] = new Book();
		
		for(int i = 0; i< book.length; i++) {
			copyBook[i].setAuthor(book[i].getAuthor());
			copyBook[i].setTitle(book[i].getTitle());
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
