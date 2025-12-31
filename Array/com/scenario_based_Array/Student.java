package com.scenario_based_Array;

public record Student(String name , EducationInstitute institute) {
	public void viewCoursesAndFees() {
		Course[] courses=institute.courses();
		for(Course course: courses) {
			IO.println(
					course.id()+"  " + course.name()+" : "+course.fee()
					);
		}
		
		
	}
	public void viewOffers() {
		Offer[] offers= institute.offers();
		for(Offer offer: offers) {
			IO.println(offer.offerText());
		}
		
	}
	public void enrollInCourse(Integer courseId) {
		institute.enrollStudentInCourse(courseId, name());
	}

}
