package InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest3 {

	public static void main(String[] args) {
		
		 
		
		try (FileInputStream fis = new FileInputStream("input.txt")) {
			int i;
			byte[] bs = new byte[10];
			while((i = fis.read(bs)) != -1) {
				for(byte b: bs) {
					System.out.print((char)b);
				}
				System.out.println();
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
	
		}
		System.out.println("end");
	}

}
