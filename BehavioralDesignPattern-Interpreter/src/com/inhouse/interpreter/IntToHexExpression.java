package com.inhouse.interpreter;

public class IntToHexExpression implements Expression {

	private int i;
	
	public IntToHexExpression(int i) {
		this.i = i;
	}

	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getHexaDecimalForamt(this.i);
	}

}
