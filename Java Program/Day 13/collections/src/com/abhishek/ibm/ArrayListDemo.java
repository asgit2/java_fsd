package com.abhishek.ibm;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("abhi");
		list.add(30);
		list.add("abhi");
		for(Object val : list) {
			System.out.print(val +" ");
		}
		System.out.println();
		list.remove(new String("abhi"));
		for(Object val : list) {
			System.out.print(val +" ");
		}

	}

}
