package com.nitish.oop;

import java.nio.channels.Pipe.SourceChannel;
import java.time.Year;

public class Collage {
	
	String name;
	String totalBrancg;
	String principalName;
	int establishYear;
	String location;
	
	public void getInfoAboutCollege() {
		System.out.println("---------------------------------------------------");
		System.out.println("Nmae of college is: "+name);
		System.out.println("Total no of branch of college is "+totalBrancg);
		System.out.println("Principa name of college : "+principalName);
		System.out.println("Year of stablisment of college is : "+establishYear);
		System.out.println("Location of college is : "+location);
		System.out.println("---------------------------------------------------");
		
	}
	
	public void CseBranchInfo() {
		String branchName="Computer Science And Engineering";
		int noOfSheet=70;
		System.out.println("Name of branch is : "+ branchName);
		System.out.println("No of sheet avlabal in this branch is : "+noOfSheet);
		System.out.println("---------------------------------------------------");
		
	}
	public void eeeBranchInfo() {
		String branchName="EEE";
		int noOfSheet=75;
		System.out.println("Name of branch is : "+ branchName);
		System.out.println("No of sheet avlabal in this branch is : "+noOfSheet);
		System.out.println("---------------------------------------------------");
		
	}
	public void meBranchInfo() {
		String branchName="ME";
		int noOfSheet=60;
		System.out.println("Name of branch is : "+ branchName);
		System.out.println("No of sheet avlabal in this branch is : "+noOfSheet);
		System.out.println("---------------------------------------------------");
		
	}
	public void CivilBranchInfo() {
		String branchName="Civil";
		int noOfSheet=80;
		System.out.println("Name of branch is : "+ branchName);
		System.out.println("No of sheet avlabal in this branch is : "+noOfSheet);
		System.out.println("---------------------------------------------------");
		
	}



}
