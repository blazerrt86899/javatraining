/* Author: Romu Tiwari
 * Employee id: 844549
 * Created on: 06/01/2020
 * Time: 11:00pm
 * Description: Greater of two number w/o Comparison Operator
 */
package com.cts;

//Biggest and Smallest Number 
//Without using comparison operator
public class Question1 {

	public static void main(String[] args) {
		
		int firstNumber = 9, secondNumber = 10;
		
		int biggest = ((firstNumber+secondNumber) + Math.abs(firstNumber-secondNumber))/2;
		System.out.println("Biggest Number is "+biggest);
		
		int smallest = ((firstNumber+secondNumber) - Math.abs(firstNumber-secondNumber))/2;
		System.out.println("Smallest number is "+smallest);

	}

}
