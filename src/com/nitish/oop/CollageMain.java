package com.nitish.oop;

public class CollageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collage bpmce=new Collage();
		bpmce.name="B.P.Mandal College Of Engineering";
		bpmce.establishYear=2016;
		bpmce.totalBrancg="CSE,ME,EEE,CIVIL";
		bpmce.principalName="A Kumar Amar";
		bpmce.location="Bihar, Madhepura";
		
		System.out.println("---------------------------------------------------");
		bpmce.getInfoAboutCollege();
		bpmce.CseBranchInfo();
		bpmce.CivilBranchInfo();
		bpmce.eeeBranchInfo();
		bpmce.meBranchInfo();
		System.out.println("---------------------------------------------------");

	}

}
