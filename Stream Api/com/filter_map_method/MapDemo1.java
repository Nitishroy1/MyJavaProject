package com.filter_map_method;

import java.util.ArrayList;

record Employee(Integer id, String name, Double Salary) {
	
}

public class MapDemo1 {
	void main() {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(101, "Suman", 50000d));
		empList.add(new Employee(103, "Scort", 60000d));
		empList.add(new Employee(104, "jon", 28000d));
		empList.add(new Employee(102, "priya", 30000d));
		empList.add(new Employee(106, "shreya", 50000d));
		empList.add(new Employee(110, "minash", 24000d));
		empList.add(new Employee(108, "suman", 52000d));
		
		empList.stream()
		  .filter(emp1 -> emp1.Salary()>=50000)
		    .map(emp-> emp.name().toUpperCase())
		 
		   .forEach(IO::println);
	}

}
