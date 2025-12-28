package com.nk.array;
import java.util.*;
public class ShortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter arr size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter your choice 1 for Assinding Order  & 2 for dessinding order:");
		
		int choice=sc.nextInt();
		
		switch (choice) {
		case 1->{
			System.out.print("Assinding order: ");
			for(int num: arr) {
				System.out.print(num+" ");
			}
		}
		case 2->{
			System.out.println("Dessinding order: ");
			for(int i=arr.length-1;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}
		}
		default ->
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}

	}

}
