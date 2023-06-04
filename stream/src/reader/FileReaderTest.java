package reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("read.txt")){
			int i;
			while((i = fr.read()) != -1) {
				System.out.println((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
