package com.nitish.elc;

import com.nitish.blc.ToDigitDiffrence;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Inter a Number:");
		int num=sc.nextInt();
		System.out.println("Diffrence of Two digits:"+ToDigitDiffrence.grtDiffOfDigits(num));

	}

}
