package com.opp.constructor.passByValue;

public class CalculateStudentGrade {
	public static StudentGrade calculateGrade(Student s1) {
		int marks=s1.getMarks();
		if(marks>90) {
			return new StudentGrade(s1,'A');
		}
		else if (marks>=75) {
			return new StudentGrade(s1,'B');
			
		}
		else if (marks>=60) {
			return new StudentGrade(s1,'C');
			
		}
		else {
			
			return new StudentGrade(s1,'D');
		}
		
	}

}
