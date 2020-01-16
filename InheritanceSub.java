package com.cts.practise;

public class InheritanceSub extends InheritanceExample{
	
	double weight;
	String color;
	
	public InheritanceSub(double length, double width, double height, double weight, String color) {
		
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.color = color;
		
	}

	public void derivedInfo() {
		System.out.println(length);
		System.out.println(width);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(color);
		
	}

}
