package com.project.walletApp.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDetails {

	private int accountNo;
	private String accountHolderName;
	private double totalAmount;
	
	@Override
	public String toString() {
		return "accountNumber= "+accountNo+" \n Account Holder Name ="+accountHolderName+"\n Total Ammount ="+totalAmount+"";
	}
	public AccountDetails(int accountno, String accountName, double amt) {
		this.accountHolderName=accountName;
		this.accountNo=accountno;
		this.totalAmount = amt;
	}
	
}
