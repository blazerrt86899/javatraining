package com.cts.practise;

public class InheritanceExample {
	
	double length;
	double width;
	double height;
	
	public InheritanceExample() {
		length = -1;
		width = -1;
		height = -1;
		
	}
	
	public InheritanceExample(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public void baseInfo() {
		System.out.println(length);
		System.out.println(width);
		System.out.println(height);
		
	}

}
