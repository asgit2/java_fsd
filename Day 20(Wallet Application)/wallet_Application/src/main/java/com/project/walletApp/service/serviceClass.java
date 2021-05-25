package com.project.walletApp.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.walletApp.bean.AccountDetails;
import com.project.walletApp.dao.DaoClass;
import com.project.walletApp.dao.DaoInterface;

@Service
@Component("service1")
public class serviceClass implements serviceInterface{
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	DaoInterface dao = context.getBean("DAO",DaoClass.class);
	
	public void CreateAccount(String name, double amount) {
		int accountNumber=generateAccountNumber();
		AccountDetails ad = new AccountDetails(accountNumber,name,amount);
		StoreInfo(accountNumber,name,amount);
	}

	public void StoreInfo(int accountNumber, String name, double amount) {
		dao.storeDetails(accountNumber,name,amount);
	}
	
	private int generateAccountNumber() {
        int accountNumber = (int)(Math.random()*9000)+1000;
        return accountNumber;
    }

}
