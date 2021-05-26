package com.project.walletApp.dao;

public interface DaoInterface {
	public void storeDetails(int accountNumber,String name, double amount);

	public boolean SerchAccount(int accountNo);

	public void UpdateAmmount(int accountNo, double amount);

	public void Withdraw(int accountNo, double amount);

	public boolean FundsTransfer(int accountFrom, int accountTo, double amount);

	public void CheckBalance(int accountNo);

	public void viewTransections(int accountFrom);
}
