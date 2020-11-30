package inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputExample3 {

	public static void main(String[] args)  {
		
		try(FileInputStream fis = new FileInputStream("input.txt")){
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
