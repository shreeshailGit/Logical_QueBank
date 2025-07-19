package com.nt.string;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator2());
		
		ts.add("Roja");
		ts.add("ShobaRani");
		ts.add("RajaKumari");
		ts.add("GangaBhavani");
		ts.add("Ramulamma");
		
		System.out.println(ts);

	}

}

class MyComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

      String s1 = o1.toString();
		String s2 = (String) o2;
      return s2.compareTo(s1);
	}
	
}