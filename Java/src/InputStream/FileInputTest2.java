package InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {
		
		 
		
		try (FileInputStream fis = new FileInputStream("input.txt")) {
			int i = fis.read();
			System.out.println((char)i);
			i = fis.read();
			System.out.println((char)i);
			i = fis.read();
			System.out.println((char)i);
			
		} catch (IOException e) {
			
			e.printStackTrace();
	
		}
		System.out.println("end");
	}

}
