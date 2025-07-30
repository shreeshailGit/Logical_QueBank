package com.nt.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {

	public static void main(String[] args) {

		Map<Employee, String> map = new HashMap<>();

		Employee emp1 = new Employee (101, "abc");

		Employee emp2 = new Employee(102, "Bob");

		Employee emp3 = new Employee(101, "abc");

		map.put(emp1, "HR");

		map.put(emp2, "Finance");

		map.put(emp3, "Legal");

		System.out.println(map.size()); // 3

		System.out.println(map.get(emp1)); // [id =101,ename=abc],HR
	
		System.out.println(map.get(emp2)); // [id =102,ename=Bob],Finance

		System.out.println(map.get(emp3)); // [id =101,ename=abc],HR
        System.out.println(map);
		//If equals(), hashcode() not overrid the getting result
		/*3
		HR
		Finance
		Legal*/

	}

}

class Employee  {
	int id;
	String name;

	Employee (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Override equals()
	/* @Override
	public boolean equals(Object o) {
	    if (this == o)
	    	return true;
	    
	    if(!(o instanceof Employee)) 
	    	return false;
	    
	    Employee that = (Employee) o;
	    return id == that.id && Objects.equals(name, that.name);
	}
	
	// Override hashCode()
	@Override
	public int hashCode() {
	    return Objects.hash(id, name);
	}*/
	
	   // Optional: For better display
	@Override
	public String toString() {
	    return "[id=" + id + ", name=" + name + "]";
	}
}
