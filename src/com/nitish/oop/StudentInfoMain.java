package com.nitish.oop;
import java.util.*;

public class StudentInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StudentInfo nitish= new StudentInfo();
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Student ID: ");
     int studId=Integer.parseInt(sc.nextLine());
     System.out.print("Enter student Name: ");
     String studName= sc.nextLine();
     System.out.print("Enter Student Marks: ");
     int studMark=Integer.parseInt(sc.nextLine());
     nitish.setStudentData(studId, studName, studMark);
     nitish.calculateGrade();
    System.out.println( nitish.displayDetails());
    sc.close();
     
	}

}
