package com.cts.day2;

public class TestStudent {

	public static void main(String[] args) {
		DayScholar ds = new DayScholar(101,"Romu","CS","MIET","Day Scholar");
		Residential r = new Residential(102,"Ajay","IT","MIET","Hostel Residential");
		
		ds.showDetails();
		System.out.println(ds.toString());
		
		r.showDetails();
		System.out.println(r.toString());
		

	}

}
