package com.globallogic.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Comparable interface ---it is interface and it takes compareto method to perform the sorting with the class
//Comparator interface
class Employee implements Comparable<Employee> {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	private int id;
	private String name;
	private double salary;

	@Override
	public int compareTo(Employee obj2) {
		// TODO Auto-generated method stub
		Employee obj1 = this;
		/**
		
		* if first object if greater than second object then return 1
		* if first object is less than second object return -1
		* if both the object are equal return zero 0  
		* */
		if (obj1.getId() > obj2.getId()) {
			return 1;
		} else if (obj1.getId() < obj2.getId()) {
			return -1;
		} else {
			return 0;
		}

		// give the sorting logic
		// string
		// return this.getName().compareTo(obj1.getName());
	}
}

public class MyUserdefinedSorting {

	public static void main(String[] args) {

		List<Employee> ls = new ArrayList<Employee>();
		ls.add(new Employee(10, "ravinder", 1000));
		ls.add(new Employee(101, "kumar", 1000));
		ls.add(new Employee(1, "zee", 1000));
		ls.add(new Employee(21, "anu", 1000));

		// passing the list and sorting method also
		Collections.sort(ls,new SortByName());

		// System.out.println(ls);
		ls.forEach(System.out::println);
	}
}
