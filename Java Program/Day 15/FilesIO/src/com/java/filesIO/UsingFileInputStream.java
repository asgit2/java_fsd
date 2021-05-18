package com.java.filesIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UsingFileInputStream {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream(new File("some.txt"));
			int val;
			while((val = fis.read()) != -1) {
				System.out.println((char)val);
			}
			fis.close();
		} catch (IOException e) {
			System.out.println("File have some issues");
		}
		

	}

}
