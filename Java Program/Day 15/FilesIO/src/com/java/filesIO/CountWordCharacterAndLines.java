package com.java.filesIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordCharacterAndLines {

	public static void main(String[] args) {

		int charCount =0;
		int wordCount=0;
		int lineCount =0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("file2.txt")));
			String CurrentLine = br.readLine();
			while(CurrentLine != null) {
				lineCount++;
				String[] words = CurrentLine.split(" ");
				wordCount += words.length;
				
				for(String word : words) {
					charCount += word.length();
				}
				CurrentLine = br.readLine();
			}
			System.out.println("No. Of Characters = "+charCount);
			System.out.println("No. Of Words = "+wordCount);
			System.out.println("No. Of Lines = "+lineCount);
		} catch (IOException e) {
			System.out.println("Can't Read file" +e.getMessage());
		}
		
	}

}
