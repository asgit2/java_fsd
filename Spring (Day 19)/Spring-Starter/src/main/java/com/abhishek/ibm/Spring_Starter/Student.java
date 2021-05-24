package com.abhishek.ibm.Spring_Starter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
	private String CollageName;
	private String Stream;
	
	public Student() {
		
	}
	public Student(String clgname,String stream) {
		this.CollageName = clgname;
		this.Stream = stream;
	}
}
