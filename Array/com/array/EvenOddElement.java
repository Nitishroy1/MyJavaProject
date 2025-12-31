package com.array;

public class EvenOddElement {
	void main() {
		int[] arr= {1,2,3,4,5,6,7};
		IO.print("Even elements are :");
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
			IO.print(arr[i]+" ");	
			}
			
		}
		IO.print("\nOdd elements are :");
		for(int a: arr) {
			if(!((a%2)==0)) {
				IO.print(a+" ");
			}
		}
	}

}
