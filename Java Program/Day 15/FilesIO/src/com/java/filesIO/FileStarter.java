package com.java.filesIO;

import java.io.File;
import java.io.IOException;

public class FileStarter {

	public static void main(String[] args) throws IOException {


		File newFile1 = new File("FirstFile.txt");
		newFile1.createNewFile();
		System.out.println(newFile1.exists());

		File newDir = new File("New Folder");
		newDir.mkdir();
		File tempFile = new File(newDir, "newfile2.txt");
		tempFile.createNewFile();
		System.out.println(tempFile.exists());
		
	}

}
