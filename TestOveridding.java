package com.cts.practise;

public class TestOveridding {

	public static void main(String[] args) {
		
		Employee e = null;
		
		e = new Manager(1001,"Romu","Savings",10);
		e.showInfo();
		System.out.println(e);
		
		System.out.println("/***************************************************************************************/");
		
		e = new Engineer(8001,"Ajay","Demat",100);
		e.showInfo();
		System.out.println(e);
		

	}

}
