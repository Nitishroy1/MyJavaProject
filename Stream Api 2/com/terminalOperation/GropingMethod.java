package com.terminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class GropingMethod {
	void main() {
		List<String> stringsnList=Arrays.asList("apple", "banana", "orange", "grape", "pear");
			/*	   
		     Map<Integer, Long> result =
		    		 stringsnList.stream()
                    .collect(Collectors.groupingBy(
                            String::length,
                            Collectors.counting()
                    ));
		   result.forEach((k,v)-> IO.println(k+" : "+v));
		   
		   */
		stringsnList.stream()
		   .sorted((p1,p2)-> p2.compareTo(p1))
		     .forEach(IO::println);
		         
	}

}
