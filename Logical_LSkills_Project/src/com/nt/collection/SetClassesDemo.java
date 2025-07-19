package com.nt.collection;

import java.util.HashSet;

public class SetClassesDemo {

	public static void main(String[] args) {
		// set object creation
		HashSet hs = new HashSet<>();
		
		//printing intializing size of collection object
		System.out.println("hs length: "+hs.size());
		
		//adding elements to hs
         System.out.println("is 20 added: "+hs.add(Integer.toString(20)));
         System.out.println("is a added: "+hs.add(new Character('a')));
         System.out.println("is b added: "+hs.add(new Character('b')));
         System.out.println("is abc added: "+hs.add("abc"));
         System.out.println("is ABC added: "+hs.add("ABC"));
         System.out.println("is abc  added: "+hs.add("abc"));
         
         System.out.println("is abc added: "+hs.add(new String("abc")));
         System.out.println("is Example added: "+hs.add(new Example()));

         System.out.println("is Example added: "+hs.add(new Example()));
    
         //adding null to hs
         System.out.println("is null added :"+hs.add(null));
         System.out.println("is null added :"+hs.add(null));
         
       //printing hs modified size and elements object
 		System.out.println("hs length: "+hs.size());
 		System.out.println("hs elements: "+hs);
 		
	}

}

class Example{
	int x=10;
	int y=20;
}