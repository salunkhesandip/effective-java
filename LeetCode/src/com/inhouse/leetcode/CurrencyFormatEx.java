package com.inhouse.leetcode;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyFormatEx {

	public static void main(String[] args) {
		double curamt = 11.23;
		Locale usa = new Locale("en","US");
		System.out.println(usa);
		Currency dollars = Currency.getInstance(usa);
		System.out.println(dollars);
		
		NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
		System.out.println(dollarFormat.format(curamt));
	}
}
