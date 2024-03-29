package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample2 {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		
		ExceptionExample2 test = new ExceptionExample2();
		try {
			test.loadClass("a.txt", "java.lang.string");
		} catch(FileNotFoundException | ClassNotFoundException e){
			System.out.println(e);
		}

	}

}
