package com.functionalInterface;

import java.util.function.Predicate;

record Student(Integer id, String name, Double marks) {
	
}
public class PridecateFunctio {
	void main() {
		
		Predicate<Student> stu= (student)-> student.marks()>=80;
		Student[] s1= {
				new Student(1,"Scort",90D),
				new Student(2,"miller",70D),
				new Student(3,"adam",80D),
		};
		for(Student s2: s1) {
			if(stu.test(s2)) {
				IO.println(s2+"=> Pass");
			}
			else {
				IO.println(s2+"=> Faill");
			}
			
		}
		
		
		
		
	}

}
