package com.Bill_Pugh_Singleton_Initialization;

	/**
	 * 		5. Bill Pugh Singleton Implementation :
	 * 
	 * 		- Prior to Java 5, java memory model had a lot of issues and the above 
	 * 		  approaches used to fail in certain scenarios.
	 * 		- So Bill Pugh came up with a different approach to create the Singleton
	 * 		  class using an inner static helper class.
	 * 		- in this approach private inner static class that contains the instance of
	 * 		  the singleton class. When the singleton class is loaded, SingletonHelper 
	 * 		  class is not loaded into memory and only when someone calls the getInstance
	 * 		  method, this class gets loaded and creates the Singleton class instance.
	 * 		- this is most widely used approach because it does not require Synchronization
	 * 
	 * **/
public class BillPughSingletonInstance {

	private BillPughSingletonInstance() {
		super();
	}

	private static class SingletonHelper{
		private static final BillPughSingletonInstance instance = new BillPughSingletonInstance();
	}
	
	public static BillPughSingletonInstance getInstance() {
		return SingletonHelper.instance;
	}
}
