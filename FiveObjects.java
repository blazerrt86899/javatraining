/* Author: Romu Tiwari
 * Employee id: 844549
 * Created on: 07/01/2020
 * Time: 11:00pm
 * Description: Defining Object creation using Constructors 
 * */
package com.cts;

public class FiveObjects {
	public FiveObjects() {
		System.out.println("Objects Created");
	}
	
	String name = "Romu";
	int id = 101;
	
	public static void main(String[] args) {
		FiveObjects f1 = new FiveObjects();
		FiveObjects f2 = new FiveObjects();
		FiveObjects f3 = new FiveObjects();
		FiveObjects f4 = new FiveObjects();
		FiveObjects f5 = new FiveObjects();
		
		System.out.println(f1.id);
		System.out.println(f1.name);
		
		System.out.println(f2.id);
		System.out.println(f2.name);
		
		System.out.println(f3.id);
		System.out.println(f3.name);
		
		System.out.println(f4.id);
		System.out.println(f4.name);
		
		System.out.println(f5.id);
		System.out.println(f5.name);

	}

}
