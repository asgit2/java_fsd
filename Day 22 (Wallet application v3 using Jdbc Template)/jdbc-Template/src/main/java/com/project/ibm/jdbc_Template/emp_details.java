package com.project.ibm.jdbc_Template;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class emp_details {
	private int emp_Id;
	private String emp_Name,emp_Location;
	
	
	public emp_details(int emp_Id, String emp_Name, String emp_Location) {
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Location = emp_Location;
	}
	
	
	@Override
	public String toString() {
		return "emp_Id=" + emp_Id + "| emp_Name=" + emp_Name + "| emp_Location=" + emp_Location + "";
	}

}
