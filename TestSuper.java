package com.cts.practise;

public class TestSuper {

	public static void main(String[] args) {
		
		BoxWeight myBox1 = new BoxWeight();
		BoxWeight myBox2 = new BoxWeight(5, 6, 7, 10);
		
		myBox2.setWeight(60);
		double w = myBox2.getWeight();
		
		System.out.println("Weight is: "+w);
		
		System.out.println("Volume is: "+myBox2.volumeBox());

		System.out.println("Volume is: "+myBox1.volumeBox());
		
		

	}

}
