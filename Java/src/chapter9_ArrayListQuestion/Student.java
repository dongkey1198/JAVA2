package chapter9_ArrayListQuestion;

import java.util.ArrayList;

public class Student {
	
	private String studentName;
	ArrayList<Book> bookList;
	
	public Student(String studentName) {
		this.studentName = studentName;
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String bookTitle) {
		Book book = new Book(bookTitle);
		bookList.add(book);
	}
	
	public void showInfo() {
		
		System.out.print(studentName + " 학생이 읽은 책은 : " );
		
		for(Book book : bookList) {
			System.out.print(book.getBookTitle() + " ");
		}
		System.out.println("입니다.");
	}
	
	
	
	
}
