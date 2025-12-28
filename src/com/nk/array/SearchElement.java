
package com.nk.array;
import java.util.*;
public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Size of array: ");
		int n= sc. nextInt();
		if(n<0) {
			System.out.println("Size must be >0");
			return;
		}
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.print("Enter the  search Key Value: ");
		int key= sc.nextInt();
		
		boolean status= false;
		for(int j=0;j<arr.length;j++) {
			int index=j;
			
			if(arr[j]==key) {
				status=true;
				
				System.out.println("Element found in index no: "+index+" value is: "+arr[j]);
			}
	
	    	}
		if(!status) {
			System.out.println("Element Not found:");
		}
		sc.close();
		
		
		

	}

}
