package com.nt.coderByte;

import java.util.Stack;

public class BracketMatcher_Test {

	public static void main(String[] args) {
		System.out.println("BracketMatcher_Test.main() "+isValidate("shreeshai)))("));

	}
	//peak() - Returns the element on the top of the stack, but does not remove it.
	//pop() - Removes and returns the top element of the stack. An ‘EmptyStackException’ 
    //        An exception is thrown if we call pop() when the invoking stack is empty.
	//firstElement() -	Returns the first component (the item at index 0) of this vector.

	public static boolean isValidate(String str) {
		char[] cs = str.toCharArray();
	
		Stack<Character> stack = new Stack<>();
	    
	    for(int i=0; i<cs.length; i++) {
	       if(cs[i] == '(') {
	    	   stack.push(cs[i]);
	       } else if(cs[i] == ')') {
	    	   if(stack.isEmpty()) {
	    		   return false;
	    	   }else {
	    		   stack.pop();
	    	   }
	       }//else if   	
	    }//for
	   return stack.isEmpty() ? true : false;
	}

}
