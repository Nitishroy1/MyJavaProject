package com.scenario_based_Array;

public record EducationInstitute(Course[] courses, Offer[] offers) {
	  
	
	
	public Course[] courses() {
		return courses;
	}

	public Offer[] offers() {
		return offers;
	}

	public void enrollStudentInCourse(int courseId, String studentName) {
		
		for(int i=0; i<courses.length;i++) {
			
			if(courses[i].id()==courseId) {
			IO.println(studentName+" enrolled in:"+courses[i].name());	
			return;
			}
			
		}
		
			IO.println("Course with ID "+ courseId+" not found.");
			
		}
		
		
		/*switch(courseId) {
		case 1 ->
		{
		   IO.println(studentName+" enrolled in: Java");	
		}
		case 2 ->
		{
			IO.println(studentName+" enrolled in: .Net");	
		}
		case 3 ->
		{
			IO.println(studentName+" enrolled in: Python");	
		}
		default ->{
			IO.println("Course with ID "+ courseId+" not found.");
		}
		}*/
		
	}


