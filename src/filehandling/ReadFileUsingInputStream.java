package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingInputStream {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream  file = new FileInputStream("d://empLoggerfile.log");
		
		int data;
		while((data = file.read()) != -1) {
			System.out.print((char)data);
		}
		
	}

}
