package com.Eger_Initialization;

	/**
	 * 		Singleton Design Pattern :

	 * 
	 * 		- Singleton is a Creational Design Pattern that lets you ensure that a class
	 * 		  has only one instance while providing global instance point to this instance
	 * 		- Singleton design pattern used for logging, Driver objects caching and
	 * 		  threadPools 
	 * **/

	/**
	 * 		1. Singleton Design Pattern with Eager Initialization
	 * 
	 * 		In eager initialization, the instance of Singleton Class is created at the time
	 * 		of class loading
	 * 
	 * 		limitation :	- the instance of class is created even though client application 
	 * 						  might not be using it.
	 * 						- this method doesn’t provide any options for exception handling.
	 * **/

public class EagerSingletonInstance {
	
	//step 1 : create private static instance of the singleton class
	private static EagerSingletonInstance instance = new EagerSingletonInstance();

	//step 2 :
	private EagerSingletonInstance() {
		super();
	}
	
	public static EagerSingletonInstance getInstance() {
		return instance;
	}
}
