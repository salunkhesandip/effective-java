package com.inhouse.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private List<String> employeeList;
	
	public Employee () {
		employeeList = new ArrayList<String>();
	}
	
	public Employee(List<String> employeeListTmp) {
		this.employeeList = employeeListTmp;
	}

	public void loadData() {
		employeeList.add("Sandip");
		employeeList.add("Katie");
		employeeList.add("Allie");
	}
	
	public List<String> getemployeeList() {
		return employeeList;
	}

	// Deep copying
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> employeeListTmp = new  ArrayList<String>();
		for(String str : this.getemployeeList()) {
			employeeListTmp.add(str);
		}
		return new Employee(employeeListTmp);
	}
	
	
}
