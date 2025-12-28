package com.functio.supllier.functionalInterface;

import java.util.function.Consumer;

record Student(Integer id, String name, String course) {
	
}

public class StudentNotification {
  void main() {
	  int num=Integer.parseInt(IO.readln("Enter number of students: "));
	  
	  for(int i=1;i<=num;i++) {
		  IO.println("\n");
		  IO.println("Enter details for Student "+i+":");
		  Integer id= Integer.parseInt(IO.readln("Enter Student Id: "));
		  String name=IO.readln("Enter student name: ");
		  String course= IO.readln("Enter Student Course Name: ");
		  Student student=new Student(id, name, course);
		    
		  
		  Consumer<Student> c1= (stud)->{
			 IO.println("Hello "+stud.name()+"! Welcome to the "+stud.course()+" course.");
		  };
		  c1.accept(student);
		  
	  }
	  
  }
}
