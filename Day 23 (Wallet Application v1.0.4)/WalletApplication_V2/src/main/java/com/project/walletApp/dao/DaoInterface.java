package com.project.walletApp.dao;

import java.util.List;

import com.project.walletApp.bean.AccountDetails;
import com.project.walletApp.bean.transection_tabel;

public interface DaoInterface {
		public void storeDetails(AccountDetails accountDetails);

	public boolean SerchAccount(int accountNo);

	public void UpdateAmmount(int accountNo, double amount);

	public void Withdraw(int accountNo, double amount);

	public boolean FundsTransfer(int accountFrom, int accountTo, double amount);

	public List<AccountDetails> CheckBalance(int accountNo);

	public List<transection_tabel> viewTransections(int accountFrom);
}
