package com.StaticBlock_Initialization;

	/**
	 * 		2. Singleton Design Pattern with Static block Initialization : 
	 * 
	 * 		- It is same as Eager initialization
	 * 		- Instance of class is created in static block that provide option for exception
	 * 		  handling
	 * 
	 *  	limitation :	- it also creates object of class at the time of class loading
	 *  					  although we are using it or not
	 *  
	 * **/

public class StaticBlock_SingletonInstance {

	private static StaticBlock_SingletonInstance instance;

	static {
		try {
			instance = new StaticBlock_SingletonInstance();
		} catch (RuntimeException e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	private StaticBlock_SingletonInstance() {
		super();
	}
	
	public static StaticBlock_SingletonInstance getInstance() {
		return instance;
	}
}
