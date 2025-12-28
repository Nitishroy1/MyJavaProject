package com.opp.constructor.passByValue;
import java.util.*;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Student Name: ");
		String name= sc.nextLine();
		
		System.out.print("Enter Student marks: ");
		int marks= Integer.parseInt(sc.nextLine());
		
		Student s1= new Student(name,marks);
		StudentGrade grade= CalculateStudentGrade.calculateGrade(s1);
		System.out.println(grade);
		
		sc.close();
	}

}
