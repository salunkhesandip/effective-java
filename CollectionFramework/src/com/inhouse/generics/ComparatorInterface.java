package com.inhouse.generics;

import java.util.Arrays;

public class ComparatorInterface {

	public static void main(String[] args) {
		Employee[] empArr = new Employee[3];
		empArr[0] = new Employee(1,"Sandip",1000);
		empArr[1] = new Employee(2,"Allie",2000);
		empArr[2] = new Employee(3,"Katie",4000);
		
		Arrays.sort(empArr, Employee.salaryComparator);
		System.out.println("Salary based Sorting of Employees list:\n"+Arrays.toString(empArr));
	}

}
