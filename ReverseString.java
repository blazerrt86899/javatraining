package com.cts.day4;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed: ");
		String str = sc.next();
		
		char ch[] = str.toCharArray();
		for(int i = ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}

	}

}
