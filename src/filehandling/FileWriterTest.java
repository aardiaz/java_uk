package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWriterTest {
	
	public static void main(String[] args) throws IOException {
		
		FileReader  file = new FileReader("d://student.csv");
		BufferedReader  br = new BufferedReader(file);
		
		String line;
		br.readLine();
		
		while((line=br.readLine()) != null) {
			System.out.println(line);
			String[] data = line.split(",");
			System.out.println(data[1]);
		}
		
	}

}
