package chapter9_Array;

public class BookArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] book = new Book[5];
		
		book[0] = new Book("태백산맥1", "조정래");
		book[1] = new Book("태백산맥2", "조정래");
		book[2] = new Book("태백산맥3", "조정래");
		book[3] = new Book("태백산맥4", "조정래");
		book[4] = new Book("태백산맥5", "조정래");
				
		for(int i = 0; i<book.length; i++) {
			System.out.println(book[i]);
			book[i].showBookInfo();
		}
	}

}
