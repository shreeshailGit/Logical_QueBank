package com.nt.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet<>(new MyComparator());
		
		set.add(10);
		set.add(15);
		set.add(0);
		set.add(7);
		set.add(20);

		System.out.println(set);
	}

}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		   Integer i1 = (Integer)o1;
		   Integer i2 = (Integer)o2;
		     
		        if(i1> i2){
		           return -1; 
		        }else if(i1 < i2) { 
		           return +1;
		         }else if(i1 == i2) {
		            return 0;
		          }
		return 0;
	}
	
}