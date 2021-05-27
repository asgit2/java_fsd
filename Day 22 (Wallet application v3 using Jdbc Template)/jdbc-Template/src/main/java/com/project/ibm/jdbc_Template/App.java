package com.project.ibm.jdbc_Template;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

	public static void main( String[] args ){
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	jdbcDao JdbcDao = context.getBean("jdbcDao",jdbcDao.class);
    	
    	System.out.println("Number of Employees : "+ JdbcDao.getCount());
    	
    	Scanner sc= new Scanner(System.in);
    	
    	int choice;
    	while(true) {
    		System.out.println("Select from the Menu");
    		System.out.println("1. Enter New Record");
    		System.out.println("2. Update Execisting Record");
    		System.out.println("3. Delete a record");
    		System.out.println("4. Display All the records");
    		System.out.println("5. Exit");
    		choice = sc.nextInt();
    		switch (choice) {
			case 1:
				System.out.println("Enter ID");
		    	int id=sc.nextInt();
		    	System.out.println("Enter name");
		    	String name = sc.nextLine();
		    	System.out.println("Enter Location");
		    	String location = sc.nextLine();
		    	JdbcDao.AddNewRecord(new emp_details(id, name, location));
				break;
			case 2:
				System.out.println("Enter Id");
				id=sc.nextInt();
		    	System.out.println("Enter name");
		    	name = sc.nextLine();
		    	System.out.println("Enter Location");
		    	location = sc.nextLine();
		    	JdbcDao.UpdateRecord(new emp_details(id, name,location));
		    	break;
			case 3:
				System.out.println("Enter Id");
				id=sc.nextInt();
				JdbcDao.DeleteRecord(id);
				break;
			case 4:
		    	JdbcDao.printData().forEach(value -> System.out.println(value) );
		    	break;
			case 5:
				System.out.println("----------------------------------------------------");
				System.out.println("Thank You!");
				System.out.println("----------------------------------------------------");
				return;
			}
    		
    	}
    	
    	
    }
}
