package com.nitish.oop;

public class StudentInfo {
	int studentId;
	String studentName;
	int studentMarks;
	char studentGrade;
	
	//method
	public void setStudentData(int studId, String studName, int studMarks) {
		studentId=studId;
		studentName=studName;
		studentMarks=studMarks;
		
	}
	public String displayDetails() {
		
		return "[ name= "+studentName+", studentId= "+studentId+", marks= "+ studentMarks+", grade= "+ studentGrade+" ]";
		
	}
    public void calculateGrade() {
    	if(studentMarks >=90) {
    		studentGrade='A';
    	}
    	else if(studentMarks>=81) {
    		studentGrade='B';
    	}
    	else if(studentMarks>=71) {
    		studentGrade='C';
    	}
    	else if(studentMarks>=61) {
    		studentGrade='D';
    	}
    	else {
    		studentGrade='E';
		}
		
	}
}
