package com.collections.lambdaExpressions;

public class ThreadUsingLambda {

	public static void main(String[] args) {

		new Thread(() ->
		{
			for(int i=0;i<=5;i++) {
				System.out.println("Thread Running...");
				try {
					Thread.sleep(2000);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}).start();

	}

}
