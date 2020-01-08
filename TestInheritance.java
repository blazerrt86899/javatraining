/* Author: Romu Tiwari
 * Employee id: 844549
 * Created on: 08/01/2020
 * Time: 11:00pm
 * Description: Test Inheritance and Overriding
 * */
package com.cts.day2;

public class TestInheritance {

	public static void main(String[] args) {
		
		TV tv = new TV();
		DVDPlayer dvd = new DVDPlayer();
		
		tv.switchOn();
		tv.display();
		tv.idle();
		tv.switchOff();
		
		
		dvd.switchOn();
		dvd.play();
		dvd.idle();
		dvd.switchOff();
	}

}
