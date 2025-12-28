package com.nk.array;

import java.util.Scanner;

public class PrintElementPresentOfEvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter arr size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Element present in even Index: ");
		for(int j=0;j<arr.length;j++) {
			if(j%2==0) {
				System.out.print(arr[j]+" ");
			}
		}

	}

}
