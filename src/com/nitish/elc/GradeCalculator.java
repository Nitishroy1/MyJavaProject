package com.nitish.elc;
import java.util.*;

import com.nitish.blc.Student;
public class GradeCalculator {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your marks: ");
	int marks=sc.nextInt();
	System.out.println(Student.calculateGrade(marks)); 
	sc.close();

}
}
