package com.cts.practise;

public class Employee {
	
	int empId;
	String empName;
	String accountInfo;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId,String empName, String accountInfo) {
		
		this.empId = empId;
		this.empName = empName;
		this.accountInfo = accountInfo;
	
	}
	
	public void showInfo() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(accountInfo);
	}

}
