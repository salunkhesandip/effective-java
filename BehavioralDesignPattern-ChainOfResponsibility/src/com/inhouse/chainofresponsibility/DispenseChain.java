package com.inhouse.chainofresponsibility;

public interface DispenseChain {
	void setNextChain(DispenseChain chain);
	void dispense(Currency cur);

}
