package com.inhouse.observer;

public class ObserverPatternTest {
	public static void main(String[] args) {
		// create subject
		MyTopic topic = new MyTopic();
		
		// create observers
		Observer obj1 = new MyTopicSubscriber("obj1");
		Observer obj2 = new MyTopicSubscriber("obj2");
		Observer obj3 = new MyTopicSubscriber("obj3");
		
		// register observer to subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);
		
		// attach observer to subject
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);
		
		// check if any update available
		obj1.update();
		
		// now send message to subject
		topic.postMessage("New message");
	}
}
