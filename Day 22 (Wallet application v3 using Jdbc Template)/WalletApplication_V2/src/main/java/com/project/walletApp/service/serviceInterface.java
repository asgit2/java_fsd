package com.project.walletApp.service;

import java.util.List;

import com.project.walletApp.bean.AccountDetails;
import com.project.walletApp.bean.transection_tabel;

public interface serviceInterface {
	
	public int CreateAccount(String name, double amount);
	public void DepositeToAccount(int accountNo,double amount);
	public void StoreInfo(AccountDetails accountDetails);
	public void WithdrawFromAccount(int accountNo, Double amount);
	public String FundsTransfer(int accountFrom, int accountTo, Double amount);
	public List<AccountDetails> CheckBalance(int accountNo);
	public List<transection_tabel> PrintTranscetion(int accountFrom);
	
}
