package com.ArrayQustion;

public class Pairs_with_a_Given_Sum {
	void main() {
	int[] arr= {2,7,4,8,3,5,1,6};
	int targettSum=9;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if((arr[i]+arr[j])==targettSum) {
				IO.println("("+arr[i]+", "+arr[j]+") =" + targettSum);
			}
		}
	}

}
}
