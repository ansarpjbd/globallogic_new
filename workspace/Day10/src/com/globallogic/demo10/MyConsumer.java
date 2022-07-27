package com.globallogic.demo10;

import java.util.*;
import java.util.function.*;

/**
 * 
 * Consumer --this is interface in java 1.8 it is functional interface that
 * accept the lambda as parameters and do the exections for which code is given
 * it will not return anything it has two method accept and andThen
 */

public class MyConsumer {

	public static void main(String[] args) {

		// List<Integer>
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(-10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		// this consumer will take the object and print it
		Consumer<Integer> printConsumer = s -> System.out.println(s);

		// it will find the square root and set it back
		Consumer<List<Integer>> sqrt = list -> {
			for (int i = 0; i < ls.size(); i++) {
			//	ls.set(i, ls.get(i) * ls.get(i));
			}
		};

		// it will receive the list and print using for each and again using the
		// printcousmer
		Consumer<List<Integer>> printConsumerList = list -> list.stream().forEach(printConsumer);

		sqrt.andThen(printConsumerList).accept(ls);

		// System.out.println();

		// Supplier

		Supplier<Integer> supplier = new Supplier<Integer>() {
			@Override
			public Integer get() {
				return new Random().nextInt();
			}
		};

		Supplier<Integer> supplier2 = () -> new Random().nextInt();

		System.out.println(supplier.get());

		// Predicates :it will check and return true and false

		Predicate<Integer> predicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer num) {
				// TODO Auto-generated method stub
				if (num > 0) {
					return true;
				} else {
					return false;
				}
			}
		};
		
		ls.stream().filter(predicate).forEach(printConsumer);
		
		//System.out.println(predicate.test(-4));
	}
}
