package com.nk.array;
import java.util.*;

public class StudentArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Student students[]=new Student[3];
		students[0]=new Student(101, "Nitish", 89.5 );
		students[1]=new Student(102, "Anita", 92.0 );
		students[2]=new Student(103, "Kiran", 85.75 );
		
		// print each Student object (printing the array directly shows a memory reference)
		for (Student s : students) {
			System.out.println(s);
		}
		sc.close();

	}

}