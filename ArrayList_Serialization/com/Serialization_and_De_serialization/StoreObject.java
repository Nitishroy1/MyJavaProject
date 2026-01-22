package com.Serialization_and_De_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

record Student(Integer studentId, String studentName,Double studentFee,LocalDate dateOfAdmition) implements Serializable {
	public static Student getStudentObject() {
		Integer id=Integer.parseInt(IO.readln("Enter Student id: "));
		String name=IO.readln("Enter student Name: ");
		Double fee=Double.parseDouble(IO.readln("Enter Student Fee: "));
		DateTimeFormatter formatter =
		        DateTimeFormatter.ofPattern("dd/MM/yy");
		LocalDate dateOfAdmition=LocalDate.parse(IO.readln("Enter date of Admition: "),formatter);
		return  new Student(id, name, fee, dateOfAdmition);
	}
	
}


public class StoreObject {
	void main() throws IOException {
		String filePath="D:\\nit_java\\Student.txt";
		var fout=new FileOutputStream(filePath);
		var oos=new ObjectOutputStream(fout);
		try(fout;oos){
			int size=Integer.parseInt(IO.readln("Enter size of Student ArrayList:"));
			ArrayList<Student> list=new ArrayList<Student>();
			for(int i=1;i<=size;i++) {
				list.add(Student.getStudentObject());
			}
			oos.writeObject(list);
			IO.println("Student Object store in file Successfully");
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
