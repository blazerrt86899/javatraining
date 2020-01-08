/* Author: Romu Tiwari
 * Employee id: 844549
 * Created on: 08/01/2020
 * Time: 11:00pm
 * Description: Test Inheritance and Overriding
 * */
package com.cts.day2;

public class ElectronicItem {
	
	String model;
	String name;
	int price;


	public void switchOn() {
		System.out.println("It is ON");
	}
	
	public void switchOff() {
		System.out.println("It is OFF");
	}
	
	public void idle() {
		System.out.println("My item is at idle state.");
	}
	

}
