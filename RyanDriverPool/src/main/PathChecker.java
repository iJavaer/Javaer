package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathChecker {

	public static void main(String[] args) throws IOException {
		if ((args != null) && (args.length == 1)) {
			Path path = Paths.get(args[0]);
			File file = new File(args[0]);
			if (Files.exists(path) && !Files.notExists(path)) {
				System.out.println(path + " exists..");
			} else if(!Files.exists(path) && !Files.notExists(path)) {
				System.err.println(">>> access denied..");
			} else {	
				System.out.println("path not exist..");
				String fileName = String.valueOf(path.getFileName());
				if (fileName.contains(".")) {
					Path dir = path.getParent();
					if (Files.exists(dir)) {
						System.out.println("dir exists. creating " + path.getFileName());
						file.createNewFile();
					} else {
						System.out.println("dir not exist. creating " + path);
						file.getParentFile().mkdirs();
						file.createNewFile();
					}
				} else {
					System.out.println("Creating " + file);
					file.mkdir();
				}
			}
		} else {
			System.err.println(">>> Usage: <program> <path>..");
		}
	}
	
	/**
	 * Test 1 - existed file - D:\Dropbox\programmer\blog\debug.log - pass
	 * Test 2 - not existed file - D:\Dropbox\programmer\blog\test.txt - pass
	 * Test 3 - existed folder - D:\Dropbox\programmer\blog - pass
	 * Test 4 - existed file - D:\Dropbox\programmer\blog\testFolder - pass
	 * Test 5 - not existed dir and file - D:\Dropbox\programmer\blog\testFolder\test.txt - pass
	 */

}
