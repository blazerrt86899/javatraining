/* Author: Romu Tiwari
 * Employee id: 844549
 * Created on: 07/01/2020
 * Time: 11:00pm
 * Description: Defining Object creation using Constructors (Using For Loop)
 * */
package com.cts;

public class ObjectCreation {
	static int count = 1;
	
	public ObjectCreation() {
		System.out.println("Object created "+count+" times");
	}

	public static void main(String[] args) {
	
		ObjectCreation obj = null;
		for(int i=1;i<6;i++) {
			obj = new ObjectCreation();
			count++;
			
			
		}

	}

}
