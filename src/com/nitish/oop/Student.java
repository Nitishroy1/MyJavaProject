package com.nitish.oop;



public class Student {
	String name;
	double height;
	double age;
	String aducation;
	String state;
	
	public void getInformatinAboutStudent() {
		System.out.println("Name of student is: "+name);
		System.out.println("age of the student is: "+age);
		System.out.println("higher aducation of the student is: "+aducation);
		System.out.println("height of student : "+ height);
		System.out.println("state of the student is:"+ state);
		
		System.out.println("------------------------------------------------");
	}
	
	public void getInfoAboutAducationQualification() {
		String class10="2019";
		String class12="2021";
		String ugdegri="2025";
		System.out.println("Year of passing of class 10th is: "+ class10);
		System.out.println("Year of passing of class 12th is: "+ class12);
		System.out.println("Year of passing of Ug degri  is: "+ ugdegri);
		System.out.println("------------------------------------------------");
		
	}
	public void getInfoAboutUgDegri() {
		String branch ="computer science And Engineering";
		double totalCgpa=7.83;
		String collegeName="B.P Mandal College of Engineering";
		System.out.println("Name of college is : "+collegeName);
		System.out.println("Branch of Student in Engineering is : "+branch);
		System.out.println("Total cgpa of student is Academic: "+totalCgpa);
		System.out.println("------------------------------------------------");
		
	}

}
