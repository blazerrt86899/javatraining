package com.cts.day4;

public class TestIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Geeks";
		String s1 = "Geeks";
		String s3 = new String("Geeks");
		
		System.out.println(s==s1);
		System.out.println(s1==s3);
		System.out.println(s3==s);
		
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s));

	}

}
