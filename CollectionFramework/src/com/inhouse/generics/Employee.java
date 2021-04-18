package com.inhouse.generics;

import java.util.Comparator;

public class Employee implements Comparable <Employee> {
	private int id;
	private String name;
	private long salary;
	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[id= " + this.id + ", name=" + this.name + ", salary=" + this.salary +"]" ;
	}
	@Override
	public int compareTo(Employee emp) {
		return this.id - emp.id;
	}
	
	public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			 return (int) (o1.salary - o2.salary);
		}
		
	};
}
