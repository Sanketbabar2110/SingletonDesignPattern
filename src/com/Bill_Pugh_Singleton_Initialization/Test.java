package com.Bill_Pugh_Singleton_Initialization;

public class Test {
	public static void main(String[] args) {
		
		BillPughSingletonInstance obj1 = BillPughSingletonInstance.getInstance();
		BillPughSingletonInstance obj2 = BillPughSingletonInstance.getInstance();
		
		System.out.println(obj1 == obj2);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
