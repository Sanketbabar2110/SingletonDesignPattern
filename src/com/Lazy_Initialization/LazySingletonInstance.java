package com.Lazy_Initialization;

	/**
	 * 		3. Singleton Design Pattern with Lazy Initialization :
	 * 
	 * 		- in lazy initialization first we declare public static reference of that class  
	 * 		- instance of class is created in global access method
	 * 		- the new instance of that class is created if and only if instance is null
	 * 		  otherwise it will return same instance
	 * 
	 *  	limitation :	- the above all implementations works fine with single-threded
	 *  					  environment but in case multi-threded environment it can cause
	 *  					  issue. if multiple threds inside if condition at the same time
	 *  					  It will break the singleton pattern and both thread get the 
	 *  					  different objects
	 *  
	 * **/
public class LazySingletonInstance {

	private static LazySingletonInstance instance;

	private LazySingletonInstance() {
		super();
	}
	
	public static LazySingletonInstance getInstance() {
		
		if(instance == null) {
			instance = new LazySingletonInstance();
		}
		return instance;
	}
}
