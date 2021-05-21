package com.ibm.eis.dao;

import java.util.Map;

import com.ibm.eis.bean.Emp_Details;

public interface DaoInterface {

	void StoreDetails(Emp_Details emp);
	Map<Integer,Emp_Details> DisplayDetails();
}
