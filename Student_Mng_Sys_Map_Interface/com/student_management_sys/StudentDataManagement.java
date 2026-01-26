package com.student_management_sys;


import java.util.Collections;
import java.util.HashMap;



public class StudentDataManagement {
	void main() {
	HashMap<String, Integer> map=new HashMap<String, Integer>();
	while(true) {
	IO.println("------------- Student Management Menu -----------------");
	IO.println("1. Add Student");
	IO.println("2. Update Marks");
	IO.println("3. Delete Student");
	IO.println("4. Search Student");
	IO.println("5. Display All Students");
	IO.println("6. Show Topper");
	IO.println("7. Show Lowest Scorer");
	IO.println("8. Show Total And Average Marks");
	IO.println("9. Exit");
	
	int choice =Integer.parseInt(IO.readln("Enter your choice: "));
	
	switch(choice) 
	{
	case 1->
	{
		int n=Integer.parseInt(IO.readln("Enter Number of Student: "));
		for(int i=1;i<=n;i++) {
			String name=IO.readln(i+". Enter Student Name: ");
			Integer marks=Integer.parseInt(IO.readln("Enter Student Marks: "));
			IO.println("-----------------------------");
			map.put(name, marks);
		}
		map.forEach((k,v)-> IO.println(k+ " : "+v));
	}
	case 2->{
		IO.println("Enter Student Updated Marks");
		String name=IO.readln(". Enter Student Name: ");
		Integer marks=Integer.parseInt(IO.readln("Enter Student Marks: "));
		map.put(name, marks);
		
	}
	case 3->
	{
		IO.println("Enter Student name the you want Delete:  ");
		String name=IO.readln();
		if(map.containsKey(name)) {
			map.remove(name);
			IO.println("Student deleted succesfully..");
		}
		
	}
	case 4->{
		String name=IO.readln(". Enter Student Name: ");
		if(map.containsKey(name)) {
			IO.println("Student is Present..");
			
		}
		else {
			IO.println("Student is Not Present..");
		}
	}
	case 5->{
		map.forEach((k,v)-> IO.println(k+ " : "+v));
	}
	case 6->
	{
		IO.println("Topper data is: ");
		var intry=Collections.max(map.entrySet(),(s1,s2)->s1.getValue().compareTo(s2.getValue()));
		IO.println("Topper Student data is: Name: "+intry.getKey()+" Marks: "+intry.getValue() );
		
	}
	case 7->{
		IO.println("Lowest Scorer data is: ");
		var intry=Collections.min(map.entrySet(),(s1,s2)->s1.getValue().compareTo(s2.getValue()));
		IO.println("Lowest Scorer Student data is: Name: "+intry.getKey()+" Marks: "+intry.getValue() );
		
		
	}
	case 8->{
		int total=0;
		for(Integer m : map.values()) {
			total+=m;
		}
		double avgmark=(double)total/map.size();
		IO.println("Total marks: "+total);
		IO.println("Avrage marks: "+avgmark);
		
	}
	case 9->{
		IO.println("Thanks for visting...!!");
		System.exit(0);
		
	}
	default->{
		IO.println("Enter the correct number");
	}
	}
	

}
}
}
