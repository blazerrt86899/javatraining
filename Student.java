/* Author: Romu Tiwari
 * Employee id: 844549
 * Created on: 08/01/2020
 * Time: 11:00pm
 * Description: Test Inheritance and Overriding
 * */
package com.cts.day2;

public class Student {
	
	int studentId;
	String studentName;
	String studentDept;
	String studentCollege;
	String studentHousing;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, String dept, String college, String housing) {
		
		this.studentId = id;
		this.studentName = name;
		this.studentDept = dept;
		this.studentCollege = college;
		this.studentHousing = housing;
	}



	public void showDetails() {
		System.out.println("Displaying student details");
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDept=" + studentDept
				+ ", studentCollege=" + studentCollege + ", studentHousing=" + studentHousing + "]";
	}
	
	

}
