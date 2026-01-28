package com.HashMape_with_list;
import java.util.*;
import java.util.Map.Entry;
public class CourseRegistration {
	void main() {
		HashMap<String, List<String>>map=new HashMap<String, List<String>>();
		while(true) {
			IO.println("--- Course Registration Menu ---");
			IO.println("1. Register student to course");
			IO.println("2. View course-wise student list");
			IO.println("3. Remove student from course ");
			IO.println("4. Exit");
			int choice = Integer.parseInt(IO.readln("Enyer your choice: "));
			switch(choice) {
			case 1->{
				int n=Integer.parseInt(IO.readln("No of Student  want to Enrole this course: "));
				for(int i=1;i<=n;i++) {
				String cName=IO.readln("Enter course name: ");
				String sName=IO.readln("Enter student name: ");
				map.computeIfAbsent(cName, key->new ArrayList<String>()).add(sName);
				}
				
				
			}
			case 2->{
				IO.println("Course → Students List:");
				map.forEach((k,v)->IO.println(k+":"+v));
			}
			case 3->{
				String cName=IO.readln("Enter course name: ");
				String sName=IO.readln("Enter student name: ");
//				map.remove(cName, sName);
//				IO.println("Student remove");
//				Iterator<Set<Map.Entry<String, List<String>>>>it=map.entrySet().iterator();
//				while(it.hasNext()) {
//				
//				}
				map.computeIfPresent(cName, (k,v)->{
					v.remove(sName);
					return v;
				}
				);
				IO.println( sName +" : has removed from "+ cName);
				
			}
			case 4->{
				IO.println("thanks for vesiting...");
				System.exit(0);
			}
			}
		}
	}

}
