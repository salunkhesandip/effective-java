package com.inhouse.mediator;


public class ChatClient {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Sandip");
		User user2 = new UserImpl(mediator, "Allie");
		User user3 = new UserImpl(mediator, "Katie");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);

		user1.send("Hello everyone!!!");
	}

}
