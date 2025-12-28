package com.functionalInterface;
@FunctionalInterface
interface Predictable{
	boolean verify(Integer num);
}

public class Functionaldemo1 {
public static void main(String[] args) {
	Predictable p1=num -> num %2==0;
	int no=Integer.parseInt(IO.readln("Enter a number : "));
	IO.println("Is number"+no+"even number"+p1.verify(no));
	
}
}
