package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileUsingOutpStream {
	
	/*
	 * 1> FileOutputStream : write file
	 * 2> FileInputStream  : read file
	 */

	 public static void main(String[] args) throws IOException {
		
		 FileOutputStream  file = new FileOutputStream("d://hello.txt");
		 file.write("Hello java".getBytes());
		 
		 file.close();
		 System.out.println("success");		 
	}
}
