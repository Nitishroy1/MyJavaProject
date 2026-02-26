package com.logicalQustion;

import java.util.ArrayList;

public class Demo {
   void main() {
	   ArrayList<String> list=new ArrayList<>();
	   list.add("ind23ia");
	   list.add("ind45ia");
	   list.add("ind45ia");
	   int sum=0;
	   for(String str: list) {
		   for(int i=0;i<str.length();i++) {
			   if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
			  sum += Integer.parseInt(String.valueOf(str.charAt(i)));

		   }
	   }
   }
	IO.println(sum);   
}
}
