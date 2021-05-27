package com.project.walletApp.service;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.walletApp.bean.AccountDetails;
import com.project.walletApp.bean.transection_tabel;
import com.project.walletApp.dao.DaoClass;
import com.project.walletApp.dao.DaoInterface;

@Service
@Component("service1")
public class serviceClass implements serviceInterface{
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	DaoInterface dao = context.getBean("DAO",DaoClass.class);
	
	public int CreateAccount(String name, double amount) {
		int accountNumber=generateAccountNumber();
		AccountDetails ad = new AccountDetails(accountNumber,name,amount);
		dao.storeDetails(ad);
		StoreInfo(ad);
		return accountNumber;
	}

	public void StoreInfo(AccountDetails accountDetails) {
		dao.storeDetails(accountDetails);
	}
	
	private int generateAccountNumber() {
        int accountNumber = (int)(Math.random()*9000)+1000;
        return accountNumber;
    }
	
	public void DepositeToAccount(int accountNo,double amount) {
		if(dao.SerchAccount(accountNo)) {
			dao.UpdateAmmount(accountNo,amount);
		}
		return;
	}
	
	
	public List<AccountDetails> CheckBalance(int accountNo) {
		if(dao.SerchAccount(accountNo)) {
			List<AccountDetails> list = dao.CheckBalance(accountNo);
			return list;
		}
		return null;
		
	}

	public void WithdrawFromAccount(int accountNo, Double amount) {

		if(dao.SerchAccount(accountNo)) {
			dao.Withdraw(accountNo, amount);
		}
		
	}

	public String FundsTransfer(int accountFrom, int accountTo, Double amount) {
		if(dao.SerchAccount(accountFrom) && dao.SerchAccount(accountTo)) {
			if(dao.FundsTransfer(accountFrom,accountTo,amount)){
				return "Funds are Transfered from "+accountFrom +"to "+accountTo;
			}
			else	
				return "Insufficient Balance | Funds Transfer Failed";
		}
		return "Invalid Account Number | Funds Transfer Failed";
	}
	
	public List<transection_tabel> PrintTranscetion(int accountFrom) {
		return dao.viewTransections(accountFrom);
	}


	

}
