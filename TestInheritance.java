package com.cts.practise;

public class TestInheritance {

	public static void main(String[] args) {
		
		InheritanceExample superClass = new InheritanceExample(5,6,7);
		InheritanceSub subClass = new InheritanceSub(3, 4, 5, 78, "Blue");
		
		System.out.println("/**********************/");
		//From BaseClass
		superClass.baseInfo();

		System.out.println("/**********************/");
		//From DerivedClass
		subClass.baseInfo();

		System.out.println("/**********************/");
		subClass.derivedInfo();

		System.out.println("/**********************/");

	}

}
