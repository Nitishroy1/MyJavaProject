package com.nitish.elc;
import java.util.*;

import com.nitish.blc.StudentDetails;

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter student data");
		System.out.print("Enter student Roll No: ");
		int roll_no=Integer.parseInt(sc.nextLine());
		System.out.print("Enter student Name: ");
		String stu_Name=sc.nextLine();
		System.out.print("Enter student Fee: ");
		double stu_Fee= Double.parseDouble(sc.nextLine());
		System.out.println(StudentDetails.getStudentDetails(roll_no, stu_Name, stu_Fee));

	}

}
