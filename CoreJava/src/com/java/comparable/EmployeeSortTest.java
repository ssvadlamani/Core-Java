package com.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortTest {
	public static void main(String[] args) {
		List<Employee> empls= new ArrayList<Employee>();
		empls.add(new Employee("Siva",31));
		empls.add(new Employee("sankar",21));
		empls.add(new Employee("Shilpa",25));
		empls.add(new Employee("Naresh",21));
		empls.add(new Employee("Santhosh",11));
		empls.add(new Employee("Sranvathi",13));
		empls.add(new Employee("Vijji",24));
		empls.add(new Employee("Rama",51));
		empls.add(new Employee("Sai",21));
		empls.add(new Employee("Siva",35));
	Collections.sort(empls);
	System.out.println(empls);
	}
}
