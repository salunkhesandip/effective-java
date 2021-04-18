package com.inhouse.strategy;


public class CreditCardStrategy implements PaymentStrategy {

	private String name, cardnumber, cvv, dateOfExp;
	
	public CreditCardStrategy(String name, String cardnumber, String cvv, String dateOfExp) {
		super();
		this.name = name;
		this.cardnumber = cardnumber;
		this.cvv = cvv;
		this.dateOfExp = dateOfExp;
	}

	@Override
	public void pay(int amount) {

		System.out.println(amount + " paid with Credit Card.");
	}

}
