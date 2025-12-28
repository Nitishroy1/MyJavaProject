package com.nitish.oop;

public class StudentMain {

	public static void main(String[] args) {
		Student nitish = new Student();
		nitish.name="Nitish Kumar";
		nitish.age=22.5;
		nitish.aducation="Ug Degri";
		nitish.height=5.6;
		nitish.state="Bihar";
		nitish.getInformatinAboutStudent();
		nitish.getInfoAboutAducationQualification();
		nitish.getInfoAboutUgDegri();
		
		System.out.println("------------------------------------------------");
		Student manisha=new Student();
		manisha.name="Manisha yadav";
		manisha.age=22.5;
		manisha.aducation="Ug Degri";
		manisha.height=5.5;
		manisha.state="Bihar";
		manisha.getInformatinAboutStudent();
		manisha.getInfoAboutAducationQualification();
		manisha.getInfoAboutUgDegri();
		

	}

}
