package com.cts.practise;

public class OverloadConstructor {
	
	double length;
	double width;
	double height;
	
	public OverloadConstructor() {
		length = -1;
		width = -1;
		height = -1;
	}
	
	public OverloadConstructor(double len) {
		length = width = height = len;
		
	}
	
	public OverloadConstructor(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double volume() {
		
		return length * width * height;
	}

	public static void main(String[] args) {
		OverloadConstructor cons1 = new OverloadConstructor();
		OverloadConstructor cons2 = new OverloadConstructor(7);
		OverloadConstructor cons3 = new OverloadConstructor(5,6.4,7.8);
		
		System.out.println(cons1.volume());

		System.out.println(cons2.volume());

		System.out.println(cons3.volume());

	}

}
