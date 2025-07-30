package com.nt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Comparator_Test {

	public static void main(String[] args) {
		// List of Students
        List<Student> students = new ArrayList<>();
        
      	// Add Elements in List
      	students.add(new Student(111, "Mayank"));
        students.add(new Student(131, "Anshul"));
        students.add(new Student(121, "Solanki"));
        students.add(new Student(101, "Aggarwal"));

        // Sort students by roll number
      	// using SortbyRoll comparator
        Collections.sort(students, new SortByRoll());

      	System.out.println("Sorted by Roll Number ");

        // Iterating over entries to print them
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));
      	
        
        String str  = "shreeshail12345";
        System.err.println(str.length());
        Random random = new Random();
        String collect = Stream.generate(() ->  String.valueOf(str.charAt(random.nextInt(str.length())))).limit(6).collect(Collectors.joining());
	System.out.println(collect);
	}//main
}

class SortByRoll implements Comparator<Student>{
	// Compare by roll number in ascending order
	@Override
	public int compare(Student o1, Student o2) {
		return o1.rollno - o2.rollno;
	}
	
}

class Student{
	
	 int rollno;
	 String name;
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}