package com.nk.array;

import java.util.Scanner;

public class FrequencyOfElement1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int freq[] = new int[n];
        int visited = -1;

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (freq[i] == visited) // already counted, skip it
                continue;

            int count = 1; // start count for arr[i]
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited; // mark as visited
                }
            }
            freq[i] = count;
        }

        System.out.println("\nFrequency of each element:");
        for (int i = 0; i < n; i++) {
            if (freq[i] != visited) {
                System.out.println("Number: " + arr[i] + "  Frequency: " + freq[i]);
            }
        }

        sc.close();
    }
}
