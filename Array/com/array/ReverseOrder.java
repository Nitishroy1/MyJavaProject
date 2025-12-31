package com.array;

public class ReverseOrder {
	void main() {
		int[] arr= {1,2,3,4,5};
		for(int i= arr.length-1;i>=0;i--) {
			IO.print(arr[i]+" ");
		}
	}

}
