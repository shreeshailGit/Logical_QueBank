package com.nt.string;

public class InternMethodBestExample {

	public static void main(String[] args) {

        String s1 = new String("xyz");
        String s2 = new String("xyz");

        System.out.println(s1 == s2);
        
        //intern Method is sharing the same Memory
        //(intern () method returns a canonical representation of the string object.)
       
        s1 = s1.intern();
        s2 = s2.intern();
        
        System.out.println(s1 == s2);
	}

}
