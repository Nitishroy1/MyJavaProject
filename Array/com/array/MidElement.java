package com.array;



public class MidElement {
	void main() {
		int[] arr= {1,2,3,4,5,6};
		int n=arr.length;
		if(n%2==0) {
			IO.println(arr[n/2 -1] +" "+ arr[n/2]);
		}
		else {
			IO.println(arr[n/2]);
		}
		}
	}


