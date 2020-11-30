package streamOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("input.txt", true)){
			fos.write(97);
			fos.write(98);
			fos.write(99);
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
