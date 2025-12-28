package com.tipeParameter;
import java.util.function.*;

//import java.util.function.BiConsumer;
//import java.util.function.BiFunction;
//import java.util.function.BiPredicate;
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.function.Supplier;

public class StudentDemo {
	void main() {
		//Integer num=Integer.parseInt(IO.readln("enter number"));
		Predicate<Integer> inttype=(num1)-> num1%2==0;
		BiPredicate<String,Integer > bipredicate=(str, num1)->{
			return str.length()==num1;
		};
		IO.println(inttype.test(12));
		IO.println(bipredicate.test("ram", 3));
		Consumer<Integer> consumer=(num1)-> IO.println("number is "+num1);
		BiConsumer<Integer, Integer> biconsumer= (num, num1)->{
			IO.println("Sum of the number: "+(num+num1));
		};
		consumer.accept(12);
		biconsumer.accept(12, 12);
		Function<Integer, String> functio=(num)->{
			return "your number is"+num;
		};
		BiFunction<Integer,Integer, Integer> bifunction=(a,b)->{
			return a+b;
		};
		IO.println(functio.apply(12));
		IO.println(bifunction.apply(12, 12));
		
		//Supliaer
		Supplier<Integer> supplier=()->{
			int a=10;
			int b=20;
			return a+b;
		};
		IO.println(supplier.get());
		
		UnaryOperator<Integer> uniary=(n)-> n*n;
		BinaryOperator<Integer>binary=(n,n1)-> n*n1;
		IO.println(uniary.apply(12));
		IO.println(binary.apply(12, 4));
	}

}
