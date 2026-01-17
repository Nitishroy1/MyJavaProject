package com.ArrayQustion;

public class Smallest_and_Largest_Elements {
	void main() {
		int[] arr = {15, 3, 7, 22, 5, 9, 12};

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]>max) {
        		max=arr[i];
        	}
        	else if(arr[i]<min) {
        		min=arr[i];
        	}
        	
        }
//        for(int i=0;i<arr.length;i++) {
//        	if(arr[i]<min) {
//        		min=arr[i];
//        	}
//        }
        IO.println("Smallest element:"+ min);
        IO.println("Largest element:"+max);
	}

}
