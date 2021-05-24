package com.abhishek.ibm.Spring_Starter;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Project {

	private String name;
	private List<String> technology;
	
	public Project() {
		
	}
}
