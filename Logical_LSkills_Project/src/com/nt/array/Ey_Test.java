package com.nt.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;
import java.util.stream.Collectors;
//EY India 2nd round
public class Ey_Test {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(80,90,110,120);
		
		List<Double> list3 = list.stream().map(s -> s > 100 ? s + (s*0.1) : s).collect(Collectors.toList());
     	System.out.println(list3);
		
		/*List<Integer> list = Arrays.asList(80,90,110,120);
		
		List<Double> collect = list.stream().filter(i -> i > 100).map(m -> m * 0.1).collect(Collectors.toList());
		
		//	System.out.println(collect);
		
		ListIterator<Integer> iterator = list.listIterator();
		while(iterator.hasNext()) {
			Integer val = iterator.next();
		   if(val > 100) {
			   iterator.set(val + 10);
		   }
		}
		System.out.println(list);*/
     	
		/*List<Double> list = Arrays.asList(80.0,90.0,110.0,120.0);
		
		List<Double> resultDouble = list.stream().map(salary -> salary > 100 ? salary * 1.10 : salary).collect(Collectors.toList());
		System.out.println(resultDouble);*/
		
	
		/* String str1 = "CDEFD";
		 String str2 = "CDCD";
		 // CDD
		//  String[] 
		 int index = 0 ;
		 str1.length();
		 //while(index<str1.length())
		*/	   
	   
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		
	   e1.setName("a");
	   e2.setName("b");
	   e3.setName("c");
	   e4.setName("a");
	   List<Employee> listt  = new ArrayList<>();
	   listt.add(e1);listt.add(e2);listt.add(e3);listt.add(e4);
	   
	   List<String> list2 = listt.stream().map(Employee :: getName).distinct().collect(Collectors.toList());
	//   System.out.println(list2);
	   
	   String s = "shreeshail vikram sarate";
	   LinkedHashMap<Character, Long> map = s.chars().mapToObj(c -> Character.toLowerCase( (char) c))
	            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new,Collectors.counting()));
	//   System.out.println(map);
	   
	  // Class.forName("com.exmplae.MyClass");
	}

}

class Employee {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
