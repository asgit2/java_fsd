package com.project.walletApp.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyEventListner implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("Event Triggured :"+event.toString());
	}

}
