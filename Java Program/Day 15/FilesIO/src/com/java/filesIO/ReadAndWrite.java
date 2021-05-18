package com.java.filesIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndWrite {

	public static void main(String[] args) {

		
		try {
			File file2 = new File("file2.txt");
			file2.createNewFile();
			FileReader fr = new FileReader(file2);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			StringBuilder builder = new StringBuilder("");
			int i=0;
			while((line = br.readLine()) != null) {
				builder.append(i++ +"\t" +line);
				builder.append("\n");
			}
			fr.close();
			System.out.println("Content of file Line by Line:");
			System.out.println(builder);
			
		} catch (IOException e) {
			System.out.println("File is not available" + e.getMessage());
		}

	}

}
