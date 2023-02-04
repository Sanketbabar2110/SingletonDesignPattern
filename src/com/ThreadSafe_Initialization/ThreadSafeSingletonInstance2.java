package com.ThreadSafe_Initialization;

	/**
	 * 		- to increse performance double checked locking principle is used. In this
	 * 		  approach, the synchronized block is used inside the if condition with an
	 * 		  additional check to ensure that only one instance of a singleton class is 
	 * 		  created. 
	 * **/

public class ThreadSafeSingletonInstance2 {

	private static ThreadSafeSingletonInstance2 instance;

	private ThreadSafeSingletonInstance2() {
		super();
	}
	//It is also called as double check locking
	public static ThreadSafeSingletonInstance2 getInstance() {
		
		if(instance == null) {
			synchronized(ThreadSafeSingletonInstance2.class){
				if(instance == null)
					instance = new ThreadSafeSingletonInstance2();
			}
		}
		return instance;
	}
}
