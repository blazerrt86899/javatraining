package com.cts.practise;

public class Engineer extends Employee{
	
	int numberOfProjects;

	public Engineer() {
		
	}

	public Engineer(int empId,String empName, String accountInfo, int numberOfProjects) {

		super(empId,empName,accountInfo);
		this.numberOfProjects = numberOfProjects;

	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println(numberOfProjects);
	}

	@Override
	public String toString() {
		return "Engineer [numberOfProjects=" + this.numberOfProjects + ", empId=" + this.empId + ", empName=" + this.empName
				+ ", accountInfo=" + this.accountInfo + "]";
	}
	
	

}
