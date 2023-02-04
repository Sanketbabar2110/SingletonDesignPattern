package com.ThreadSafe_Initialization;

	/**
	 * 		4. Singleton Design Pattern with Lazy Initialization :
	 * 
	 * 		- it is same as lazy initialization but here the global access method declared
	 * 		  as synchronized so that only one thread can execute this method at a time
	 * 
	 *  	Limitation :	it works fine and provide thread safety but it reduces the 
	 *  					performance
	 * 
	 * **/
public class ThreadSafeSingletonInstance {

	private static ThreadSafeSingletonInstance instance;

	private ThreadSafeSingletonInstance() {
		super();
	}
	
	public static synchronized ThreadSafeSingletonInstance getInstance() {
		
		if(instance == null) {
			instance = new ThreadSafeSingletonInstance();
		}
		return instance;
	}
}
