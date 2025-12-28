package com.functionalInterface;

import java.util.function.Consumer;

public class ValueModifier {
	public static void  modifyValue(int value, Consumer<Integer> u) {
		
		u.accept(value);
	}
	void main() 
	{
		
		
		
		Consumer<Integer> doubleValue= num -> IO.println("After doubling the value: "+num*2);
		Consumer<Integer> incrementBy= num -> IO.println("After incrementing the value by 3: "+ (num+3));
		Consumer<Integer> squareValue = num ->{ 
		if(num<=0) {
			System.exit(0);
		}
		IO.println("After squaring the value: "+num*num);
		};
		
		int num=Integer.parseInt(IO.readln("Original value:"));
		
		ValueModifier .modifyValue(num, doubleValue);
		ValueModifier .modifyValue(num, incrementBy);
		ValueModifier .modifyValue(num, squareValue);
		
	}
	

}
