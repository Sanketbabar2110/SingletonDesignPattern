package com.StaticBlock_Initialization;

public class Test {
	public static void main(String[] args) {
		
		StaticBlock_SingletonInstance obj1 = StaticBlock_SingletonInstance.getInstance();
		StaticBlock_SingletonInstance obj2 = StaticBlock_SingletonInstance.getInstance();
		
		System.out.println(obj1==obj2);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
