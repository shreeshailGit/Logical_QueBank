package com.nt.string;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet ts = new TreeSet(new MyComparator1());

		ts.add(40);
		ts.add(30);
		ts.add(20);
		ts.add(90);
		System.out.println(ts);
	}

}

class MyComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		
		if(i1 < i2) {
			return -1;
		}else if(i1 > i2) {
			return +1;
		}else {	
		   return 0;
		}
	}
	
	
}