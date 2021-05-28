package com.project.walletApp.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class ThePublisher implements ApplicationEventPublisherAware{
	
	private ApplicationEventPublisherAware publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher thePublisher) {
		this.publisher = (ApplicationEventPublisherAware) thePublisher;
		
	}
	public void AccountCreated() {
		System.out.println("Account Created Successfully");
		AccountCreatedSuccessfully newAccount = new AccountCreatedSuccessfully(this);
		((ApplicationEventPublisher) publisher).publishEvent(newAccount);
	}

}
