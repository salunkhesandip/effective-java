package com.inhouse.prototype;

import java.util.List;

public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee1 = new Employee();
		employee1.loadData();
		
		Employee employee2 = (Employee)employee1.clone();
		Employee employee3 = (Employee)employee1.clone();
		
		List<String> list = employee2.getemployeeList();
		list.add("John");
		
		List<String> list1 = employee3.getemployeeList();
		list1.remove("Allie");
		
		System.out.println("employee1 : " + employee1.getemployeeList());
		System.out.println("list : " + list);
		System.out.println("list1 : " + list1);
	}

}
