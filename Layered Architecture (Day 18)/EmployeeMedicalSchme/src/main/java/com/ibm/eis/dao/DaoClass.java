package com.ibm.eis.dao;

import java.util.HashMap;
import java.util.Map;

import com.ibm.eis.bean.Emp_Details;

public class DaoClass implements DaoInterface{

	private Map<Integer,Emp_Details> employees = new HashMap<Integer,Emp_Details>();
	int i=0;
	public void StoreDetails(Emp_Details emp) {
		employees.put(i++, emp);
	}
	public Map<Integer,Emp_Details> DisplayDetails(){
		return employees;
	}

}
