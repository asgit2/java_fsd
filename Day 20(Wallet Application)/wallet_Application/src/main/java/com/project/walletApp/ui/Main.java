package com.project.walletApp.ui;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.walletApp.service.serviceClass;
import com.project.walletApp.service.serviceInterface;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	serviceInterface service = context.getBean("service1", serviceClass.class);
    	
		int choice ,accountNo;
		String name;
		Double amount;
		while(true) {
			System.out.println("Enter Your Choice :");
			System.out.println("----------------------------------------------------------");
			System.out.println("1. Create New Account");
			System.out.println("2. Deposite Ammount");
			System.out.println("3. Withdraw");
			System.out.println("4. Funds Transfer");
			System.out.println("5. Print Transection");
			System.out.println("6. Check Balance");
			System.out.println("7. Exit");
			System.out.println("----------------------------------------------------------");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter The details to Open an Account:");
				System.out.println("----------------------------------------------------------");
				System.out.println("Enter Name:");
				name = sc.nextLine();
				System.out.println("Enter Tha Amount:");
				amount = sc.nextDouble();
				service.CreateAccount(name,amount);
				break;
			case 2:
				break;
			case 7:
				return;
			}
		}

	}

}
