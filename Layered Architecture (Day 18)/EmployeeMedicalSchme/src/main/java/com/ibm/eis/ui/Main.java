package com.ibm.eis.ui;

import java.util.Scanner;

import com.ibm.eis.service.ServiceClass;
import com.ibm.eis.service.ServiceInterface;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServiceInterface service = new ServiceClass();
		int choice;
		while(true) {
			System.out.println("-------------------------------------------------");
			System.out.println("----------------Enter your choics----------------");
			System.out.println("1. Add a new Record");
			System.out.println("2. Display all the records");
			System.out.println("3. Exit");
			System.out.println("-------------------------------------------------");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter The Employee Details");
				System.out.println("-------------------------------------------------");
				System.out.println("Enter Employee ID");
				int id = sc.nextInt();
				System.out.println("Enter Employee Name");
				String name = sc.nextLine();
				System.out.println("Enter Employee Designation");
				String designation = sc.nextLine();
				System.out.println("Enter Employee Salary");
				double sal = sc.nextDouble();
				service.AddDetails(id, name, designation, sal);
				System.out.println("Employees Details Added Successfully...");
				System.out.println("-------------------------------------------------");
				break;
				
			case 2:
				System.out.println("Display Employee Details");
				System.out.println("-------------------------------------------------");
				service.DisplayDetails();
				System.out.println("-------------------------------------------------");
				break;
			case 3:
				System.out.println("-------------------------------------------------");
				System.out.println("Thank You!");
				System.out.println("-------------------------------------------------");
				return;
			}
		}

	}

}
