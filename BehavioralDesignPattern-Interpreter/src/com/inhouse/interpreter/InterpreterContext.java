package com.inhouse.interpreter;

public class InterpreterContext {

	public String getBinaryFormat(int i) {
		return Integer.toBinaryString(i);
	}
	
	public String getHexaDecimalForamt(int i) {
		return Integer.toHexString(i);
	}
}
