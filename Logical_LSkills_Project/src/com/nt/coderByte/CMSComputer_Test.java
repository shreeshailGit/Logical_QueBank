package com.nt.coderByte;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Parent {
	public void hello() {
		System.out.println("Hello Parent ");
	}
	public final void talk() {
		System.out.println("Parent talking");
	}
}

class Child extends Parent{
	public void hello() {
		System.out.println("Hello Child ");
	}
	
	public void greetings() {
		System.out.println("Good Morning");
	}
}

class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello");
	}
	
}

public class CMSComputer_Test {

	public static void main(String[] args) {
		
		//Q 1
		/*Parent p = new Child();
		p.hello();
		Child c = new Child();
		c.hello();*/
		
		// Q 2
		/*Parent p = new Child();
		p.talk();
		Child c = new Child();
		c.talk();*/
		
		//Q 3
		/*Parent p = new Child();
		p.greetings();
		Child c = new Child();
		c.greetings();*/
		
		//Q 4
		/*MyThread r = new MyThread();
		Thread t = new Thread(r);
		t.start();
		t.start();*/
		
		//Q 5 
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		//Q 6
		//Custom class we cannot extends from String/Immutable/final class bcz it's Immutable we compile time exception
		
		//Q 7 
		String s = null;
		System.out.println(s);
		
		
		//Q 8
		String a = null;
		String b = "a";
		//System.out.println(a.equals(b));
		
		//Q 9
		try {
			System.out.println("try");
			throw new IOException();
		}catch (IOException e) {
			System.out.println("ioException");
		}catch(Exception e) {
			System.out.println("exception");
		}finally {
			System.out.println("finally");
		}
		
		//Q 10
		/*Map<String,String> map = new HashMap<>();
		map.put("1", "Rahul");
		map.put("2", "Rohit");
		
		Iterator<Entry<String,String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			itr.next();
			map.put("3", "Anil");
		}
		System.out.println(map.size());*/
		
		//Q 11
		Set<Employee> set = new HashSet<>();
		
		Employee e1 = new Employee("1", "Rahul");
		Employee e2 = new Employee("1", "Rahul");
		Employee e3 = e2;
	    set.add(e1);
	    set.add(e2);
	    set.add(e3);
	    System.out.println(set.size());
	}

}
class Employee {
	private String id;
	private String name;
	
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
