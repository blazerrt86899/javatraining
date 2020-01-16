package com.cts.practise;

public class StaticCheck {
	
	static int a ;
	static int b;
	
	public static void staticMethod(int x) {
		System.out.println("X is: "+x);
		System.out.println("A is: "+a);
		System.out.println("B is: "+b);
	}
	
	static {
		System.out.println("Static block 1 initialized.");
		a = 3;
		
	}
	static {
		System.out.println("Static block 2 initialized.");
		b = a*4;
	}

	public static void main(String[] args) {
		
		staticMethod(4);
		

	}

}
