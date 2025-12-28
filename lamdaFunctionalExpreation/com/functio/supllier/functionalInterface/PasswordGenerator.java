package com.functio.supllier.functionalInterface;


import java.util.Random;
import java.util.function.Supplier;

public class PasswordGenerator {
	void main() {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String special = "@#$%!&*";
		String finalString=upper + lower + digits + special;
		
		Random random= new Random();
		int paslangth=8;
		StringBuilder pasword= new StringBuilder();
		for(int i=0;i<paslangth;i++) {
			int indexlength=random.nextInt(finalString.length());
			pasword.append(finalString.charAt(indexlength));
		}
		
		Supplier<String> passwordSupplier = () -> "Generated Password: " + pasword;
		IO.println(passwordSupplier.get());
	}

}
