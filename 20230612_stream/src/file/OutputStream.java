package file;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("b.txt")) {
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
