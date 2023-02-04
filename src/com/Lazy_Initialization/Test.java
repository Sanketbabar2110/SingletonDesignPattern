package com.Lazy_Initialization;

public class Test {
	public static void main(String[] args) {
		
		LazySingletonInstance obj1 = LazySingletonInstance.getInstance();
		LazySingletonInstance obj2 = LazySingletonInstance.getInstance();
		
		System.out.println(obj1 == obj2);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
