package com.functionalInterface;

import java.util.function.Predicate;

record Studen(Integer id,String name, Double marks) {
	
}

public class PredefineFunctionalInterface {
	void main() {
		Predicate<Student> p1=(stu) -> stu.marks()>=80;
		Student s1=new Student(101, "scort", 90d);
		if(p1.test(s1)) {
			IO.println(s1+"Pass");
		}
		
	}
	

}
