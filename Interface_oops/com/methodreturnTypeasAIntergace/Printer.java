package com.methodreturnTypeasAIntergace;

public interface Printer {
  public abstract void print();

  default void m1() {
	  IO.println("what is your name");
  }
}
