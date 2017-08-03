package com.java.comparable;

public class Employee implements Comparable<Employee> {

	private String name;
	private int age;
	public Employee(String name , int age){
		this.name = name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Employee o) {
		    
		int compare= name.compareTo(o.name);
		
		if(compare == 0 ){
			compare =Integer.compare(age, o.age);
			
		}
		return compare;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name "+name+    "     age :   "+age+"\n";
	}
	
}
