package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.bean.Emp_Details;
import com.ibm.eis.dao.DaoClass;

public class ServiceClass implements ServiceInterface {

	DaoClass dao = new DaoClass();
	
	public void AddDetails(int id,String name,String designation,double Salary) {
		String InsurenceScheme = "";
		if(designation.equals("System Associate") && (Salary > 5000 && Salary < 20000))
			InsurenceScheme += "" + "Scheme C";
		else if(designation.equals("Programmer") && (Salary >= 20000 && Salary < 40000))
			InsurenceScheme += "" + "Scheme B";
		else if(designation.equals("Manager") && Salary >= 40000)
			InsurenceScheme += "" + "Scheme A";
		else if(designation.equals("Clerk") && Salary <5000)
			InsurenceScheme += "" + "No Scheme";
			
		Emp_Details emp = new Emp_Details(id,name,designation,Salary,InsurenceScheme);
		
		
	}
	public void StoreInfo(Emp_Details emp) {
		dao.StoreDetails(emp);
	}
	@Override
	public Map<Integer,Emp_Details> DisplayDetails(){
		return dao.DisplayDetails();
	}
}
