package com.array;

public class AddfirstAndLastE {
	void main() {
		int[] arr= {1,2,3,4,9};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i==0 || i ==arr.length-1) {
				sum=sum+arr[i];
			}
			
		}
		IO.println(sum);
	}

}
