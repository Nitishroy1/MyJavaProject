package com.nitish.elc;
import java.util.*;

import com.nitish.blc.RoundedSum;

public class RoundSumAns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Therr diff number ");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		System.out.println("sum of all number round sum :"+RoundedSum.sumOfRoundedValue(a, b, c));

	}

}
