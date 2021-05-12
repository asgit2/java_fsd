package com.collections.assignments;

public class Details {
	private int ID;
	private String name;
	private String skills;
	
	
	public Details(int iD, String name, String skills) {
		super();
		ID = iD;
		this.name = name;
		this.skills = skills;
	}
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}

	
}
