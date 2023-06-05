package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	/*
	 *  a> FileWriter : write
	 *  b> FileReader : read
	 */
	
	  public static void main(String[] args) throws IOException {
		
		  FileWriter  file = new FileWriter("d://student.txt",true);
		  
		  file.write("Id = 4444\n");
		  file.write("Name = Hari KC\n");
		  file.write("College = KEC\n");
		  file.write("Age = 24\n");
		  file.write("Phone = 98734343434\n");
		  
		  file.close();
		  System.out.println("success");
	}

}
