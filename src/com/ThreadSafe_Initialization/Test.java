package com.ThreadSafe_Initialization;

public class Test {
	public static void main(String[] args) {
		
		ThreadSafeSingletonInstance obj1 = ThreadSafeSingletonInstance.getInstance();
		ThreadSafeSingletonInstance obj2 = ThreadSafeSingletonInstance.getInstance();
		
		System.out.println(obj1 == obj2);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println("______________________");
		
		ThreadSafeSingletonInstance2 obj3 = ThreadSafeSingletonInstance2.getInstance();
		ThreadSafeSingletonInstance2 obj4 = ThreadSafeSingletonInstance2.getInstance();
		
		System.out.println(obj3 == obj4);
		
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
	}
}
