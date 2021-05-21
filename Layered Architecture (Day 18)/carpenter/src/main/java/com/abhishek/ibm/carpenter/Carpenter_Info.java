package com.abhishek.ibm.carpenter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Carpenter_Info {
	private int id;
	private String name;
	private String Address;
	private int age;
}
