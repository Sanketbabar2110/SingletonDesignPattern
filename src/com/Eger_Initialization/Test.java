package com.Eger_Initialization;

public class Test {
	public static void main(String[] args) {
		
		EagerSingletonInstance obj1 = EagerSingletonInstance.getInstance();
		EagerSingletonInstance obj2 = EagerSingletonInstance.getInstance();
		
		System.out.println(obj1==obj2);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
