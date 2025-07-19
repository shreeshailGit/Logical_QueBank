package com.nt.collection;

public class NITCollection {

	Object[] objArray = new Object[10];
	int index = 0;
	
	public void addd(Object obj) {
		if(size() == capacity()) {
			incrementCapacity();
		}
		objArray[index] = obj;
	}
	
	private void incrementCapacity() {
		int  newCapacity =  objArray.length*2;
		Object[] newArray = new Object[newCapacity];
		for(int i=0; i<objArray.length; i++) {
			newArray[i] = objArray[i]; 
		}
		  
	}

	public int size() {
		return index;
	}
	public int capacity() {
		return objArray.length;
	}
	//toString method define
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		for(int i=0 ; i<size() ; i++) {
			 sb.append(objArray[i]);
			 sb.append(",");
		}
		int start = sb.lastIndexOf(",");
	   
		if(start != -1) {
		   sb.delete(start, start+2);
	    }
		sb.append("]");
		
	   return sb.toString();
	}
	
	
	public static void main(String[] args) {
		NITCollection col = new NITCollection();
		
		col.addd("a");
		col.addd("b");
		System.out.println("capacity:"+col.capacity());
		System.out.println("size: "+col.size());
		System.out.println(col.toString());

	}

}
