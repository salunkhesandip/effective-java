package com.inhouse.factory;


public class ComputerFactory {

	public static Computer createComputer(ComputerType type, String rAM, String hDD, String cPU ) {
		
		Computer comp = null;
		
		switch(type) {
		case PC:
			comp = new PC(rAM, hDD, cPU);
			break;
		case SERVER:
			comp = new Server(rAM, hDD, cPU);
			break;
			
		}
		return comp;
	}
}
