package com.nt.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		/*List<String> fruitList = Arrays.asList("Apple","Mango","Banana","Graphes","PineApple","Orange");
		
		System.out.println(fruitList);
		Iterator<String> itr = fruitList.iterator();
		
		String str ;
		while(itr.hasNext()) {
			 str = itr.next();
			 System.out.println("List of Fruits="+str);
			if(str.equals("Mango")) {
				//fruitList.remove(str);
				//itr.remove();
			}
			
		}
		System.out.println(fruitList);*/
		
		List<String> fruitList = new ArrayList<>();
	     
		fruitList.add("Apple");
		fruitList.add("Mango");
		fruitList.add("Graphes");
		fruitList.add("Peach");
		fruitList.add("Banana");
		
		System.err.println("The ArrayList elemnts are :: ");
		for(String st : fruitList) {
			System.out.println(st);
		}
		  String str ;
		Iterator<String> itr = fruitList.iterator();
		
		while(itr.hasNext()) {
			str = itr.next();
			if(str.equals("Mango")) {  
			  
				fruitList.remove(str);
			   // itr.remove(); //Solution
				
			}		 
		}
		System.err.println("The ArrayList elemnts After filter:: ");
		for(String st : fruitList) {
			System.out.println(st);
		}

	}

}
