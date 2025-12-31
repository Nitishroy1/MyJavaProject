package com.array;

public class SearchArrayElement {
	void main() {
		
		int s=Integer.parseInt(IO.readln("Enter size of Array: "));
		int[] arr= new int[s];
		boolean istrue=false;
		for(int i=0;i<s;i++) {
			IO.print("Enter Element "+(i+1)+":");
			arr[i]=Integer.parseInt(IO.readln());
		}
		int key=Integer.parseInt(IO.readln("Enter searching element: "));
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
			istrue=true;
			IO.println("Element " +key +" found at index: "+i);
			}
			
		}
		if(!(istrue)) {
          IO.println("Element not found");			
		}
		
	}

}
