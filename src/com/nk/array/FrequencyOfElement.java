package com.nk.array;
import java.util.*;

public class FrequencyOfElement {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Size of an Array: ");
		int n= Integer.parseInt(sc.nextLine());
		int arr[]=new int[n];
		System.out.println("Enter " + n + " integers:");
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(sc.nextLine());
		}

		// Use only the given 1D array: for each element, skip if it appeared earlier,
		// otherwise count occurrences by scanning the remainder of the array.
		for (int i = 0; i < n; i++) {
			boolean seenBefore = false;
			for (int k = 0; k < i; k++) {
				if (arr[k] == arr[i]) { // element already processed
					seenBefore = true;
					break;
				}
			}
			if (seenBefore) continue;

			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] == arr[i]) count++;
			}

			System.out.println("Number: " + arr[i] + " Frequency: " + count);
		}

		sc.close();
	}

}