package com.abhishek.ibm.Spring_Starter;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Engineer implements InitializingBean, DisposableBean{

	private String name;
	private Integer refCode;
	private  List<Project> projects;
	
	public Engineer() {
		
	}
//	public Engineer(String name,Integer refCode) {
//		this.name = name;
//		this.refCode = refCode;
//	}
	
	
	public void workForwages() {
		System.out.println("Name=" +this.name + "\n reference code : "+ this.refCode);
		System.out.println("Working on");
		for(Project project: projects) {
			System.out.println(project);
		}
	}
@Override
public void destroy() throws Exception {
	System.out.println("About to be Destroyed...");
	
}
@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("Code Initiated... \n \n ");
	
}
}
