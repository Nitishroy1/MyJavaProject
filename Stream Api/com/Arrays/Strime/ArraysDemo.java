package com.Arrays.Strime;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraysDemo 
{
	void main() {
	/*	Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
		Object arr[]= Arrays.stream(numbers)
		    .filter(num -> num>0)
		       .toArray();
		
		IO.println(Arrays.toString(arr));
		  */
	/*	String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
		
	Object [] name1	=Arrays.stream(names)
		    .filter(name -> name.contains("A") || name.contains("a"))
		        .toArray();
	
	   IO.println(Arrays.toString(name1));
		
		*/
		
		/*Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
	List<Integer> primeNum	=Arrays.stream(numbers)
		   .filter(n -> n > 1 )
		       .filter(n ->{
		    	   for(int i=2;i<n;i++) {
		    		   if(n % i ==0) {
		    			   return false;
		    		   }
		    	   }
		    	   return true;
		       }).toList();
	
	  primeNum.forEach(IO::println);
     */
		
		//WAP to print all the names from String array where the length of the 
	    //name must be greater than 3.	
	/*	String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
		
		Object [] obj=Arrays.stream(words)
		   .filter(name-> name.length()>3)
		     .toArray();
		     IO.println(Arrays.toString(obj));
		*/
		
		/*
	    Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};   
	    Object [] arr =Arrays.stream(numbers)
	       .distinct()
	          .toArray();
		IO.println(Arrays.toString(arr));
		*/
		
		//WAP to filter Palindrome Words from an Array.

		 String[] words = {"madam", "hello", "racecar", "java", "level", "world"};

	        Arrays.stream(words)
	            .filter(word -> {
	                StringBuilder rev = new StringBuilder();
	                for (int i = word.length() - 1; i >= 0; i--) {
	                    rev.append(word.charAt(i));
	                }
	                return word.equals(rev.toString()); // FIX
	            })
	            .forEach(System.out::println);
	        
	        
	        Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	        Set<Integer> set = Arrays.stream(numbers)
	           .filter(n -> n%2==0)
	              .collect(Collectors.toSet());
	            set.forEach(IO::println);
	            IO.print(set);
	    }
}
