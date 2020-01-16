package com.cts.practise;

public class ParamConstructors {


	double length;
	double width;
	double height;
	
	

	public ParamConstructors(double length, double width, double height) {
	
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double volume() {
		return (this.length * this.width * this.height);
	}



	public static void main(String[] args) {
		
		ParamConstructors cons1 = new ParamConstructors(10.5, 30.8, 5.5);
		ParamConstructors cons2 = new ParamConstructors(11, 34.8, 15.5);
		
		System.out.println("Volume is: "+cons1.volume());
		System.out.println("Volume is: "+cons2.volume());
		
		






	}

}
