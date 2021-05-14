package com.abhishek.ibm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Abhishek",655);
		map.put("Ronali",644);
		map.put("asg", 400);
		
		Set set = map.entrySet();
		for(Object ref: set) {
			Map.Entry me = (Map.Entry)ref;
			System.out.println("Keys:"+ me.getKey());
			System.out.println("Values:"+ me.getValue());
		}

	}

}
