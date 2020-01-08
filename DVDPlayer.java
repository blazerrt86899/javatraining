/* Author: Romu Tiwari
 * Employee id: 844549
 * Created on: 08/01/2020
 * Time: 11:00pm
 * Description: Test Inheritance and Overriding
 * */
package com.cts.day2;

public class DVDPlayer extends ElectronicItem{
	
	public void play() {
		System.out.println("I am playing.");
	}
	
	public void idle() {
		System.out.println("I am hanged");
	}

}
