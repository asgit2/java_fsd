package com.project.walletApp.events;

import org.springframework.context.ApplicationEvent;

public class AccountCreatedSuccessfully extends ApplicationEvent{

	public AccountCreatedSuccessfully(Object source) {
		super(source);
	}
	
	@Override
	public String toString() {
		return "Account Created successfully!";
	}

}
