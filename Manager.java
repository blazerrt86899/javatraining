package com.cts.practise;

public class Manager extends Employee {
	
	int numberOfInventory;

	public Manager() {
		
	}

	public Manager(int empId,String empName, String accountInfo, int numberOfInventory) {

		super(empId,empName,accountInfo);
		this.numberOfInventory = numberOfInventory;

	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println(numberOfInventory);
	}

	@Override
	public String toString() {
		return "Manager [numberOfInventory=" + this.numberOfInventory + ", empId=" + this.empId + ", empName=" + this.empName
				+ ", accountInfo=" + this.accountInfo + "]";
	}
	
	

}
