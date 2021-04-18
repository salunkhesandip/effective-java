package com.inhouse.state;


public class TVRemote {

	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();

		context.setTvState(tvStartState);
		context.doAction();
		
		context.setTvState(tvStopState);
		context.doAction();
	}

}
