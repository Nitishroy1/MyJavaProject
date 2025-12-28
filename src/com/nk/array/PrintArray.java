package com.nk.array;
import java.util.*;
public class PrintArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum=0;
		System.out.print("Enter no of arr: ");
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sum= arr[0]+arr[n-1];
		System.out.println("first and last sum: "+ sum);
		
		for(int j=0;j<arr.length;j++)
		{	
		 System.out.print(arr[j]+" ");	
		}
		System.out.println(" ");
		System.out.print("Even Element: ");
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2==0) {
			System.out.print(arr[j]+" ");	
		}
		}
		System.out.println(" ");
		System.out.print("Odd Element: ");
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]%2!=0) {
				System.out.print(arr[j]+" ");	
			}
		}
		System.out.println(" ");
		
		for(int k=arr.length-1;k>=0;k--) {
			System.out.print(arr[k]+" ");
		}
		
		
		
	}
	}
