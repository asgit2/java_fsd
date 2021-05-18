package com.java.filesIO;

import java.io.File;
import java.util.*;
public class FileInputFromUser {

	public static void main(String[] args) {
		System.out.println("Enter the name of the file");
		System.out.println("-----------------------------------");
		Scanner sc= new Scanner(System.in);
		String fileName = sc.nextLine();
		
		File f1 = new File(fileName);
		System.out.println("Infromation About the File");
		System.out.println("File Exists/Not :" + f1.exists());
		System.out.println("File is Readable/Not :"+ f1.canRead());
		System.out.println("File is Writable/Not :" + f1.canWrite());
		System.out.println("Type of the file : " + getFileType(f1.getPath()));
		System.out.println("Length of the file :" +f1.length());

	}
	public static String getFileType(String fileName) {
		String fn = new File(fileName).getName();
		int dot = fn.lastIndexOf('.');
		return (dot == -1) ? "" : fn.substring(dot+1);
	}
	

}
