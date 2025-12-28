package com.nk.array;

import java.util.Scanner;

public class FrequencyOfArrayEveryElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Size of an Array: ");
		int n= Integer.parseInt(sc.nextLine());
		int arr[]=new int[n];
		System.out.println("Enter " + n + " integers:");
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		
		for(int i=0;i<arr.length;i++) {
			int num= arr[i];
			int count=0;
			while(num!=0) {
				count++;
				num= num/10;
				
			}
			System.out.println("Number: "+arr[i]+" Digits: "+count);
		}

	}

}
