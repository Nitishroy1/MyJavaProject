package com.nk.array;

import java.util.Arrays;
import java.util.Scanner;

public class MerjToRArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter arr size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr2[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			arr2[j]=sc.nextInt();
		}
		
		
		int arr3[]=new int[arr.length+arr2.length];
		for(int i =0;i<arr.length;i++) {
			arr3[i]=arr[i];
		}
		//int k=0;
		for(int i =0;i<arr2.length;i++) {
			arr3[arr.length+i]=arr2[i];
		}
		System.out.println(Arrays.toString(arr3));
	}

}
