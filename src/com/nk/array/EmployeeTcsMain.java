package com.nk.array;
import java.util.*;
public class EmployeeTcsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of employee: ");
		int size= Integer.parseInt(sc.nextLine());
		
		EmployeeTcs employee[]=new EmployeeTcs[size];
		System.out.println("Enter Employee Detals: ");
		int c=1;
		for(int i=0;i<size;i++) {
			System.out.println("\nEnter details for Employee No: "+c);
			System.out.print("Enter Employee Id: ");
			int id= Integer.parseInt(sc.nextLine());
			System.out.print("Enter Employee Neme: ");
			String name= sc.nextLine();
			System.out.print("Enter Employee salary: ");
			double salary= Double.parseDouble(sc.nextLine());
			employee[i]=new EmployeeTcs(id, name, salary);
			c++;
			
		}
		System.out.print("Enter product ID to search: ");
		int keyID=Integer.parseInt(sc.nextLine());
		
		boolean found= false;
		for(EmployeeTcs emp: employee) {
			if(emp.getId()==keyID) {
				System.out.println("\n Product Found: "+emp);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("\n Product with ID "+ keyID+" not found. ");
		}
		
//		for(EmployeeTcs employees: employee) {
//			System.out.println(employees);
//		}
		sc.close();

	}

}
