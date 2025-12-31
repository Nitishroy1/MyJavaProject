package com.coustomClassObj;

public class EmployeeArrayDemo {
	void main() {
		
		Employee[] emp= new Employee[2];
		for(int i=0;i<emp.length;i++) {
			IO.println("\nEnter Employee detale: "+(i+1));
			
			int id=Integer.parseInt(IO.readln("Enter Employee Id: "));
			String name=IO.readln("Enter Employee Name: ");
			double salary=Double.parseDouble(IO.readln("Enter employee Salary: "));
			emp[i]=new Employee(id, name, salary);
		}
		for(Employee emp1: emp) {
			IO.println(emp1);
		}
	}

}
