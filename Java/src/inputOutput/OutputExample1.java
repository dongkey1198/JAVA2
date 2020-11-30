package inputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputExample1 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output2.txt", true)){
			fos.write(65);
			fos.write(66);
			fos.write(67);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
