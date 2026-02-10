package com.terminalOperation;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {
	void main() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers.stream()
		  .filter(n -> n%2==0)
		    .map(num -> num*num)
		      .forEach(IO::println);
	}

}
