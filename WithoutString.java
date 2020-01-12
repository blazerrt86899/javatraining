package com.cts.day4;

import java.util.Scanner;

public class WithoutString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to be reversed: ");
		String str = sc.next();
		int length = str.length();
		String reverse = "";
		for(int i =length-1;i>=0;i--) {
			reverse += str.charAt(i);
			
		}
		System.out.println("Reversed string: "+reverse);
		

	}

}
