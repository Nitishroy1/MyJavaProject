package com.functionalInterface;

import java.util.function.Predicate;

public class CalculationLogic {
	public static boolean testPredicate (int num,Predicate<Integer> p1) {
		return p1.test(num);
	}
	void main() {
		Predicate<Integer> isEven = (num)-> num%2==0;
		Predicate<Integer> isGreaterThaneTen=num-> num>10;
		Predicate<Integer> isPrime=(num) ->
		{
			if(num<=1) return false;
			for(int i=2;i<num;i++) {
				if(num%i==0) return false;
			}
			return true;
		};
		
		int num=Integer.parseInt(IO.readln("Enter your number: "));
		IO.println(num+ " is even: "+testPredicate(num, isEven));
		IO.println(num+ " is greater than 10 : "+testPredicate(num, isGreaterThaneTen));
		IO.println(num+ " is Prime: "+testPredicate(num, isPrime));
	}
	}


