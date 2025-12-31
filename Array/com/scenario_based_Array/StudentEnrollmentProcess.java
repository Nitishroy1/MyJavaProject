package com.scenario_based_Array;

public class StudentEnrollmentProcess {
	void main() {
      String name=IO.readln("Enter student name:");
      Course[] course=new Course[3];
      course[0]=new Course(1, " : Java ", 35000d);
      course[1]=new Course(2, " : .Net ", 30000d);
      course[2]=new Course(3, " : Python ", 35000d);
      
      Offer[] offer=new Offer[2];
      offer[0]=new Offer("Special discount: Get 20% off on all courses!");
      offer[1]=new Offer("Limited time offer: Enroll in any two courses and get one course free!");
      
      EducationInstitute institute=new EducationInstitute(course, offer);
      Student student=new Student(name, institute);
      student.viewCoursesAndFees();
      student.viewOffers();
      Integer courseId=Integer.parseInt(IO.readln("Enter course ID to enroll:"));
      student.enrollInCourse(courseId);
      
	}

}
