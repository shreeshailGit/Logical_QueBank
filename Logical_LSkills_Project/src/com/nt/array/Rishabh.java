package com.nt.array;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Rishabh {

	public static void main(String[] args) {

String s = "shreeeshail";


Map<Character,Long>  map =  s.chars().mapToObj(c -> Character.toLowerCase( (char) c))
           .collect(Collectors.groupingBy(Function.identity(), TreeMap :: new, Collectors.counting()  ) );

System.out.println(map);
 //map.entrySet().stream().sorted(Map.Entry.<Character,Long>comparingByValue().reversed() ).limit(3)
   //                                   .forEach(entry -> System.out.println("Top 3 characters "+entry.getKey()+" ---"+ entry.getValue() ));

   
	}

}
