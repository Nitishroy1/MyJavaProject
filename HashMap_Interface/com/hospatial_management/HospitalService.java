package com.hospatial_management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalService {
	ArrayList<Hospital> hospitallist=new ArrayList<Hospital>();
	int hospitalCode=100;
	
	public int addHospital(String hospitalName, List<String> listOfTreatments, String contactPerson, String contactNumber,
			String location) {
		
		Hospital hospital=new Hospital(hospitalName, listOfTreatments, contactPerson, contactNumber, location);
		hospital.setHospitalCode(hospitalCode++);
		hospitallist.add(hospital);
		return hospital.getHospitalCode();
		
	}
	
	//getHospitals() 
	public Map<Integer , String> getHospitals() {
		Map<Integer, String> hospitalmap=new HashMap< >();
		for(Hospital hospital: hospitallist) {
			hospitalmap.put(hospital.getHospitalCode(), hospital.hospitalName);
		}
		
		return hospitalmap;
	}
	//getHospitalDetails()
	public Hospital getHospitalDetails(int hospitalCode) {
		for(Hospital h: hospitallist) {
			if(h.getHospitalCode()==hospitalCode) {
				return h;
			}
			
		}
		return null;
		
	}

}
