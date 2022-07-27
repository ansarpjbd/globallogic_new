package com.globallogic.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author ravin Stream API --it is flow of data where data flows from one place
 *         to another place you can perform many operation on data update the
 *         data sort the data delete the data others filter
 */

public class MyStream {

	public static void main(String[] args) {

		
		List<String> cities=Arrays.asList("Chennai","Banglore","New Delhi");
		
		Consumer<String> printConsumer=t->System.out.println(t);
		Consumer<List<String>> printConsumerList=list->list.stream().forEach(System.out::println);
		
		
		
		Consumer<List<String>> upperCaseConsumer=list->{
			
			for(int i=0;i<list.size();i++ )
			{
				list.set(i,list.get(i).toUpperCase());
			}
		};
		
		upperCaseConsumer.andThen(printConsumerList).accept(cities);
		//printConsumer.andThen(printConsumer)
		
		// list
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(-10);
		ls.add(20);
		ls.add(-40);
		ls.add(-1);
		ls.add(4);
		ls.add(4);
		ls.add(6);
		ls.add(110);
		// create a stream out of list
		// Stream<Integer> st=ls.stream();
		// it will iterate and provide the object each time

		// st.forEach(obj->System.out.println(obj));

		// because you can iterate the stream only onces
		// stream has already been operated upon or closed
		// st.forEach(obj->System.out.println(obj));

		/*
		 * // args for(Object obj:ls) { System.out.println((Integer)obj); }
		 */

		// ls.stream().forEach(obj->System.out.println(obj));
		// ls.stream().forEach(obj->System.out.println(obj));

		// intermedidate operation
		// it will filter the result based on the condition
		// you filter the value and print it
		// ls.stream().filter(e->e>0).forEach(System.out::println);

		// you want to filter the value and return it
		// it will take the data one by one and it will create a list out it
		//List<Integer> positiveNumberList = 
		        ls.stream()
		        
				//there can be number of element which will varies
				.filter(e -> e > 0)  
				
				//return or false
				//it will have the same number of element 
				.map(e->e*e)
				//pass the comparator object to perform the sorting
				.sorted()
				//Returns a stream consisting of the distinct elements 
				.distinct()
				.limit(5)
				.forEach(System.out::println);
				
				//.collect(Collectors.toList());
		//List<Integer> negitiveNumberList = ls.stream().filter(e -> e < 0).collect(Collectors.toList());

		//positiveNumberList.stream().sorted(Collections.reverseOrder()).forEach(e -> System.out.println(e));

		//System.out.println("positiveNumber " + positiveNumberList);
		//System.out.println("negitiveNumber " + negitiveNumberList);
		/*
		 * for(Integer e: ls) { if(e>0) { return e; } }
		 */
		        
		   OptionalInt sum=     ls.stream().mapToInt(Integer::intValue).min();
		     
		   System.out.println("sum is "+sum);
		        
	}

}
