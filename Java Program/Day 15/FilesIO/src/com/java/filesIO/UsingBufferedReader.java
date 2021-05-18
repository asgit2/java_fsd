package com.java.filesIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			
		String dataFromFile = "";
		StringBuilder builder = new StringBuilder("");
		BufferedReader theReader;
		
			theReader = new BufferedReader(new FileReader(new File("some.txt")));
		
			while((dataFromFile = theReader.readLine()) != null) {
				builder.append(dataFromFile);
			}
			theReader.close();
			System.out.println(builder);
		} catch (IOException e) {
			System.out.println("Can't Read from file "+ e.getMessage());
		}
		

	}

}
