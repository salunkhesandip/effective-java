package com.inhouse.multithreading;
/*
 *  if you call thread.run() instead of thread.start() , no new thread is created.
 */
public class RunnableLambdaEx {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : RunnableTest");
		
		Runnable task1 = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " : is running.");				
			}
		};

		Thread thread1 = new Thread(task1);
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " : is running.");	
			}
		});
		
		thread2.start();
		
		// Lambda expression used
		Runnable task3 = ()-> {
			System.out.println(Thread.currentThread().getName() + " : is running.");
			};
			
		Thread thread3 = new Thread(task3);
		thread3.start();
		
	}

}
