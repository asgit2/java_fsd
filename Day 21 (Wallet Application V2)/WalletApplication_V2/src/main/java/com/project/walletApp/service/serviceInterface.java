package com.project.walletApp.service;

public interface serviceInterface {
	
	public void CreateAccount(String name, double amount);
	public void DepositeToAccount(int accountNo,double amount);
	public void StoreInfo(int accountNumber, String name, double amount);
	public void WithdrawFromAccount(int accountNo, Double amount);
	public String FundsTransfer(int accountFrom, int accountTo, Double amount);
	public void CheckBalance(int accountNo);
	public void PrintTranscetion(int accountFrom);
	
}
