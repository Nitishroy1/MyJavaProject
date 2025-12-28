package com.nk.array;

import java.util.Scanner;

public class LeaderElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
   

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[i]>arr[j]) {
        			System.out.println(arr[i]);
        		}
        	}
        }

	}

}
