package com.Method_Overloading;

import java.util.Scanner;

public class IO {
    private static final Scanner SC = new Scanner(System.in);

    public static String readln() {
        return SC.nextLine();
    }

    public static void println(String s) {
        System.out.println(s);
    }

    public static void println() {
        System.out.println();
    }
}
