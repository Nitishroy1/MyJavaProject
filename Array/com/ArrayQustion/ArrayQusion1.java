package com.ArrayQustion;

import java.util.Arrays;

public class ArrayQusion1 {
	void main() {
		int[] arr= {1,2,3,5,6};
		int[] newArr=new int[arr.length+1];
		int mid=(arr.length)/2;
		int val=4;
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		for(int i=arr.length-1;i>=mid;i--) {
			newArr[i+1]=arr[i];
		}
		newArr[mid+1]=val;
		IO.println(Arrays.toString(newArr));
	}
	

}
