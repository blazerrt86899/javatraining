/* Author: Romu Tiwari
 * Employee id: 844549
 * Created on: 08/01/2020
 * Time: 11:00pm
 * Description: Test Inheritance and Overriding
 * */
package com.cts.day2;

public class TV extends ElectronicItem{
	
	
	public void display() {
		System.out.println("Some channel is Running");
	}
	public void idle() {
		System.out.println("I am hanged");
	}

}
