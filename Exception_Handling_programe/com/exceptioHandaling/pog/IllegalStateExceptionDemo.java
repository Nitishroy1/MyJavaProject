package com.exceptioHandaling.pog;

public class IllegalStateExceptionDemo extends Throwable {
	void main() {
		IO.println("Calling throwIllegalException from main method:");
		throwIllegalException();
	}
	public static void throwIllegalException() {
		try {
			throw new IllegalStateExceptionDemo();
		}
		catch(IllegalStateExceptionDemo objA) {
			IO.println("Catch: "+objA);
		}
	}

}
