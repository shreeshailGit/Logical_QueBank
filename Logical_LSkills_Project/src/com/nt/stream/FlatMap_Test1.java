package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap_Test1 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		List<Integer> list3 = Arrays.asList(7,8,9);

		Stream<List<Integer>> stream = Stream.of(list1,list2,list3);
	
	   List<Integer> collect = stream.flatMap(List :: stream).collect(Collectors.toList());
	   System.err.println(collect);
	}

}
