package com.functio.supllier.functionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class PaswordGenerator {
	void main() {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String special = "@#$%!&*";
		String totalCharecter=upper+lower+digits+special;
		int length=8;
		
/*genrate random number 
 * fatch index of charecter
 * append in one place
 */
		Supplier<String>passwordSupplier=()->{
			Random random= new Random();
			StringBuilder password= new StringBuilder();
			for(int i=0;i<8;i++) {
			int randomIndex=random.nextInt(totalCharecter.length());
			password.append(totalCharecter.charAt(randomIndex));
			}
			return password.toString();
			
		};
		IO.println("Generated Password: "+ passwordSupplier.get());
	}
	

}
