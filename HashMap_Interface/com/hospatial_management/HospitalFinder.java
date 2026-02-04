package com.hospatial_management;

import java.util.ArrayList;
import java.util.List;

public class HospitalFinder {
 void main() {
	 HospitalService hospitalService=new HospitalService();
	 String hospitalName=IO.readln("Enter Hospital Name: ");
	 List<String>listOfTreatments=new ArrayList<String>();
	 int n=Integer.parseInt(IO.readln("Entr Number of treatments "));
	 for(int i=1;i<=n;i++) {
		 IO.println("Ente Name of Treatments");
		 String nameofTreatment=IO.readln();
		 listOfTreatments.add(nameofTreatment);
	 }
	 String contactPerson=IO.readln("Enter Hospital contactPerson Name: ");
	 String contactNumber=IO.readln("Enter Hospital contactNumber: ");
	 String location=IO.readln("Enter Hospital location: ");
	
	 //adding Hospital
	 int n1=Integer.parseInt(IO.readln("Entr Number of hospital you add "));
	 List<Integer> listofHospitalCode=new ArrayList<Integer>();
	 for(int i=1;i<=n1;i++) {
		 IO.println("Enter Hospital Details: ");
		 int hopitalCode=hospitalService.addHospital(hospitalName, listOfTreatments, contactPerson, contactNumber, location);
		 listofHospitalCode.add(hopitalCode);
	 }
	 
	 //hospitalService.getHospitalDetails(hopitalCode);
	 
 }
}
