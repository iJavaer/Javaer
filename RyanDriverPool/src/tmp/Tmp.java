package tmp;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Tmp {

	public static void main(String[] args) {
		
		String pathString = "D:\\home\\user\\test";
		
		Path path = Paths.get(pathString);
		
		System.out.println(path.getNameCount());
		System.out.println(path.getFileName());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		

	}
}
