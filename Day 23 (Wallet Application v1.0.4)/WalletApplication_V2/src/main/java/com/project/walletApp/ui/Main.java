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
    	
		int choice ,accountNo,accountFrom=0,accountTo=0;
		String name;
		Double amount,amountTransfer = null;
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
				int newAccountNumber=service.CreateAccount(name,amount);
				System.out.println("Account Number = "+newAccountNumber);
				break;
			case 2:
				System.out.println("Deposite Ammount ");
				System.out.println("----------------------------------------------------------");
				System.out.println("Please Enter Account Number");
				accountNo = sc.nextInt();
				System.out.println("Enter The Amount to be deposited");
				amount=sc.nextDouble();
				service.DepositeToAccount(accountNo,amount);
				break;
				
			case 3:
				System.out.println("Withdraw Amount");
				System.out.println("----------------------------------------------------------");
				System.out.println("Please enter Account Number");
				accountNo=sc.nextInt();
				System.out.println("Enter Amount to withdraw");
				amount=sc.nextDouble();
				service.WithdrawFromAccount(accountNo,amount);
				break;
				
			case 4:
				System.out.println("Funds Transfer");
				System.out.println("----------------------------------------------------------");
				System.out.println("Enter your Account number");
				accountFrom = sc.nextInt();
				System.out.println("Enter account number where to transfer");
				accountTo=sc.nextInt();
				System.out.println("Enter the Amount to be Transfered");
				amountTransfer = sc.nextDouble();
				String result=service.FundsTransfer(accountFrom,accountTo,amountTransfer);
				System.out.println(result);
				break;
			case 5:
				System.out.println("Transection Details");
				System.out.println("----------------------------------------------------------");
				service.PrintTranscetion(accountFrom).forEach(value -> {
					System.out.println("----------------------------------------------------------");
					System.out.println(value.getDate());
					System.out.println(value.getAccountFrom());
					System.out.println(value.getAccountTo());
					System.out.println(value.getAmount());
					System.out.println("----------------------------------------------------------");
				});
				System.out.println("----------------------------------------------------------");
				break;
			case 6:
				System.out.println("Check Balance");
				System.out.println("----------------------------------------------------------");
				System.out.println("Enter your Account number");
				accountNo = sc.nextInt();
				service.CheckBalance(accountNo).forEach(value -> System.out.println(value.getTotalAmount()));
				break;
			case 7:
				System.out.println("----------------------------------------------------------");
				System.out.println("Thank You for Using our service");
				System.out.println("----------------------------------------------------------");
				return;
			}
		}

	}

}
