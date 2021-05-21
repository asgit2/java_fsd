package com.ibm.eis.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Emp_Details {
	private int emp_ID;
	private String name;
	private String designation;
	private double salary;
	private String InsurenceScheme;
}
