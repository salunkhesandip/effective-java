package com.inhouse.strategy;


public class PaypalStrategy implements PaymentStrategy {
	private String emailId, passwd;
	
	public PaypalStrategy(String emailId, String passwd) {
		super();
		this.emailId = emailId;
		this.passwd = passwd;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using PayPal.");

	}

}
