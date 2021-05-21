package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.bean.Emp_Details;

public interface ServiceInterface {

	void AddDetails(int id,String name,String designation,double sal);
	void StoreInfo(Emp_Details emp);
	public Map<Integer,Emp_Details> DisplayDetails();
}
