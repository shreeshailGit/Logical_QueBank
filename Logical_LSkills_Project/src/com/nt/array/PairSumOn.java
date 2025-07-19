package com.nt.array;

import java.util.HashMap;
import java.util.HashSet;

public class PairSumOn {

	public static void main(String[] args) {
		int[] arr = {1,2,3,0,-1,4,-2};
		//o/p {1,2} {3,0} {4,-1}
		int sum =3;
		findPairsWithSum(arr,sum);
	
	}
	 public static void findPairsWithSum(int[] arr, int targetSum) {
		  HashMap<Integer, Integer>	 numsCount = new HashMap<>();
		  HashSet<String> uniquePairs = new HashSet<>();
		
			for(int num : arr) {
				int complement = targetSum - num;
			 
				//check if the complement exists in map
				if(numsCount.containsKey(complement)) {
					//create a unique pair representation
					String pair  = Math.min(num,complement)+","+Math.max(num,complement);
					
					//Check if the pair has already been found
					if(!uniquePairs.contains(pair)) {
						System.out.println("("+ pair+")");
						uniquePairs.add(pair);
				
					}
				}
				
				numsCount.put(num, numsCount.getOrDefault(numsCount, 0)+1);
			}
			
	 }

}
