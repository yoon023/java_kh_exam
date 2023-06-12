package file;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("b.txt")){
		fw.write("Hello, World2");	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
