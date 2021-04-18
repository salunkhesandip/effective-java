package com.inhouse.chainofresponsibility;

import java.util.Scanner;

public class ATMDispenseChain {
	private DispenseChain c1;
	
	public ATMDispenseChain() {
		this.c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		
		c1.setNextChain(c2);
	}

	public static void main(String[] args) {

		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		
		while(true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 20 != 0) {
				System.out.println("Amount should be in multiple of 20s.");
				return;
			}
			atmDispenser.c1.dispense(new Currency(amount));
		}
	}

}
