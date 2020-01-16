package com.cts.practise;

public class BoxWeight extends Box{

	private double weight;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public BoxWeight() {

	}

	public BoxWeight(double length, double width, double height, double weight) {
		super(length,width,height);
		this.weight = weight;
	}
	
	public  double volumeBox() {
		
		return this.getLength()*this.getWidth()*this.getHeight();
		
	}

}
