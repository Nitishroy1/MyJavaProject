package comparabal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class EmployeeComparable
	{
	public static void main(String[] args)
	{
	/*Employee []employees =new Employee [3];
	employees [0] = new Employee (333, "Scott");
	employees [1]= new Employee (111, "Zuber");
	employees [2] = new Employee (222, "Aryan");
	Arrays.sort(employees);
	for (Employee employee :employees)
	{
	System.out.println(employee);
	}
	}*/
		Vector<Employee>v = new Vector<>();
		v.add(new Employee (333, "Scott"));
		v.add(new Employee (111, "Scott"));
		v.add(new Employee (222, "Scott"));
		Collections.sort(v);
		
		for (Employee employee :v)
		{
		System.out.println(employee);
		}
		}
	}


