package com.nt.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		 HashMap<String ,Integer>    hm  = new HashMap<>();
	     hm.put("chiranjeevi", 700);
	     hm.put("balaiah", 800);
	     hm.put("venktesh", 200);
	     hm.put("nagarjun", 500);
	  
	     //   System.out.println(hm); //{nagarjun=500, balaiah=800, chiranjeevi=700, venktesh=200}
	     Set<String> keySet = hm.keySet();
	     Collection<Integer> values = hm.values();
	     System.out.println(keySet);
	     System.out.println(values);
	     
	     Iterator<Entry<String, Integer>> itr = hm.entrySet().iterator();
	     
	      while(itr.hasNext()) {
	    	  Entry<String, Integer> entry = itr.next();
	    	  System.out.println(entry.getKey()+".... "+entry.getValue());
	      }
	      
	      
	      //case :1     // TreeMap - Automatically sort the keys in ascending order while inserting.
	      Map<String,Integer> sortedMap = new TreeMap<String,Integer>(hm);
	      System.out.println("Sorting based on Keys ::"+sortedMap);
	
	      //case :2   //sort the HashMap based on values
	      List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
	 
			Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {
			
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return (o1.getValue()).compareTo(o2.getValue());
			}
			   
			});
	     // Collections.sort(list, (o1,o2) -> o1.getValue().compareTo(o2.getValue()));
	       
	       HashMap<String, Integer> lhm = new LinkedHashMap<String,Integer>();
	       		
	       for(Entry<String, Integer> aa : list) {
	    	   lhm.put(aa.getKey(), aa.getValue());
	    	  // System.out.println(entry.getKey()+"...."+entry.getValue());
	       }
	       
	       System.out.println("----------------------------------------");
	       System.err.println("Sorting based on Values ::");
	       System.out.println(lhm);
			
	         Iterator<Entry<String, Integer>> itrr = lhm.entrySet().iterator();
			  while(itrr.hasNext()) {
			   Entry<String, Integer> entrie = itrr.next();
			   System.out.println(entrie.getKey()+" .... "+entrie.getValue());
			  }
			  System.out.println("----------------------------------------");
			  //Another way
			  list.stream().sorted((o1,o2) -> (o1.getValue()).compareTo(o2.getValue())).forEach(s->{
				  System.out.println(s.getKey()+" __ " +s.getValue());
			  });
			  
			 
	}

}
