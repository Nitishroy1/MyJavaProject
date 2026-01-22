package com.Serialization_and_De_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RetriveStudentObjectInToFile {
	void main() throws IOException, ClassNotFoundException {
		String filepath="D:\\nit_java\\Student.txt";
		var finputloc=new FileInputStream(filepath);
		var finput=new ObjectInputStream(finputloc);
		try(finput;finputloc){
			while(true) {
				Student student=(Student) finput.readObject();
				IO.println(student);
			}
			
		}
		catch (IOException e) {
			IO.println("End of file has reached: "+e);
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			IO.println("End of file has reached: "+e);
		}
	}

}
