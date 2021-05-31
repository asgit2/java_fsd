package com.ibm.Chefs;


public class Chefs {

	private Integer id;
	private String name;
	private String speciality;
	@Override
	public String toString() {
		return "Chefs [id=" + id + ", name=" + name + ", speciality=" + speciality + ", YearsOfExperience="
				+ YearsOfExperience + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public Integer getYearsOfExperience() {
		return YearsOfExperience;
	}

	public void setYearsOfExperience(Integer yearsOfExperience) {
		YearsOfExperience = yearsOfExperience;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private Integer YearsOfExperience;
	
	public Chefs(int id, String name, String speciality, int yearsOfExperience) {
		super();
		this.id = id;
		this.name = name;
		this.speciality = speciality;
		YearsOfExperience = yearsOfExperience;
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	
}
