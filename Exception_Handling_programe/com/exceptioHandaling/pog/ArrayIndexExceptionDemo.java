package com.exceptioHandaling.pog;

public class ArrayIndexExceptionDemo {
	void main() {
		try {
		int n=Integer.parseInt(IO.readln("Enter size of arr: "));	
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
		int num=Integer.parseInt(IO.readln("Enter a data in array: "));
		arr[i]=num;
	}
		IO.println(arr[3]);
	}
	  catch (ArrayIndexOutOfBoundsException e) {
		  IO.println(e.getMessage());
		  IO.println(e.toString());
		  IO.println("ArrayIndexOutOfBoundsException user tried to access an invalid index.");
		  e.printStackTrace();
		
	  }

}
}
