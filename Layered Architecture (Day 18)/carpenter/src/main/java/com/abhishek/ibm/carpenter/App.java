package com.abhishek.ibm.carpenter;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;


public class App 
{
	     public static void main( String[] args ){

	    DbConnect db = new DbConnect();
    	Scanner sc=new Scanner(System.in);
    	HashMap<Integer,Object> map = new HashMap<>();
    	int choice;
    	while(true) {

    		System.out.println("-------------------------------------------------");
			System.out.println("--------Enter your choics--------");
			System.out.println("1. Add a new Record");
			System.out.println("2. Display all the records");
			System.out.println("3. Update record");
			System.out.println("4. Delate record");
			System.out.println("5. Display data in sorted order");
			System.out.println("6. Exit");
			System.out.println("-------------------------------------------------");
			switch (sc.nextInt()) {
			case 1:
		    	System.out.println("Enter the Carpenter Details: id | name | Address | age");
		    	System.out.println("-------------------------------------------------");
		    	int id,age;
		    	String name,address;
		    	try {
		    		System.out.println("Enter ID");
			    	id = sc.nextInt();
			    	System.out.println("Enter Name");
			    	name = sc.nextLine();
			    	System.out.println("Enter Address");
			    	address = sc.nextLine();
			    	System.out.println("Enter Age");
			    	age = sc.nextInt();
		    	
		    	Carpenter_Info obj = new Carpenter_Info(id,name,address,age);
		    	map.put(id, obj);
		    	db.AddEmployeeDetail(id,name,address,age);
		    	}catch(Exception e) {
		    		System.out.println("Invalid Input :" +e.getMessage());
		    	}
		    	System.out.println("-------------------------------------------------");
				break;
			case 2:
				System.out.println("Displaying All the records");
				System.out.println("-------------------------------------------------");
				db.getDetails();
				System.out.println("-------------------------------------------------");
				break;
			case 3:
				System.out.println("To Update a records enter ID");
				System.out.println("-------------------------------------------------");
				try {
					System.out.println("Enter ID");
			    	id = sc.nextInt();
			    	System.out.println("Enter Name");
			    	name = sc.nextLine();
			    	System.out.println("Enter Address");
			    	address = sc.nextLine();
			    	System.out.println("Enter Age");
			    	age = sc.nextInt();
			    	if(map.containsKey(id)) {
				    	((Carpenter_Info) map.get(id)).setName(name);
				    	((Carpenter_Info) map.get(id)).setAddress(address);
				    	((Carpenter_Info) map.get(id)).setAge(age);
			    	}
			    	else {
			    		Carpenter_Info obj2 = new Carpenter_Info(id,name,address,age);
				    	map.put(id, obj2);
			    	}
					db.UpdateRecord(id,name,address,age);
				}
				catch(Exception e) {
		    		System.out.println("Couldn't Update Invalid Input :" +e.getMessage());
		    	}
				
		    	
				System.out.println("-------------------------------------------------");
				break;
			case 4:
				System.out.println(" To Delete a Record enter Id");
				System.out.println("-------------------------------------------------");
				id = sc.nextInt();
				if(map.containsKey(id)) {
					map.remove(id);
				}
				db.DeleteRecord(id);
				System.out.println("-------------------------------------------------");
				break;
				
			case 5:
				
				System.out.println("Sort By");
				System.out.println("-------------------------------------------------");
				System.out.println("1. By Id");
				System.out.println("2. By Name");
				System.out.println("3. By Age");
				int ch = sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("Detailed Sorted by id");
					System.out.println("-------------------------------------------------");
					db.sortBy(ch);
					System.out.println("-------------------------------------------------");
					break;
				case 2:
					System.out.println("Detailed Sorted by Name");
					System.out.println("-------------------------------------------------");
					db.sortBy(ch);
					System.out.println("-------------------------------------------------");
					break;
				case 3:
					System.out.println("Detailed Sorted by Age");
					System.out.println("-------------------------------------------------");
					db.sortBy(ch);
					System.out.println("-------------------------------------------------");
					break;
				}
				
				break;
			case 6:
				System.out.println("-------------------------------------------------");
				System.out.println("Thank You for Using our Service");
				System.out.println("-------------------------------------------------");
				return;
			}
    		
    	}

    }
    
     
}




