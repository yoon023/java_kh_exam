package file;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;


public class FilePath {
	public static void main(String[] args) {
		Path path = Paths.get("C:/workspace/java/20230612_stream/a.txt");
		try {
			String str = Files.readString(path);
			System.out.println(str);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
