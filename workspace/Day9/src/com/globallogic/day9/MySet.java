package com.globallogic.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *List : it will allow the duplicate  
 * it will maintain the insertion order
 * it can hold multiple NULL value
 */

/**
 * Set : it will not allow the duplicate it will not maintain the insertion
 * order it will allowed on one NUll value
 * 
 * HasSet: does not maintain the order LinkedHashSet: which will maintain the
 * insertion order TreeSet: it will have the sorted data
 */

public class MySet {

	public static void main(String[] args) {

		List<Integer> ls1 = new ArrayList<Integer>();

		ls1.add(3);
		ls1.add(5);
		ls1.add(10);
		ls1.add(13);
		ls1.add(1);
		ls1.add(1);

		Set<Integer> ls2 = new HashSet<Integer>();

		ls2.add(3);
		ls2.add(5);
		ls2.add(10);
		ls2.add(13);
		ls2.add(1);
		ls2.add(1);

		Set<Integer> ls3 = new LinkedHashSet<Integer>();

		ls3.add(3);
		ls3.add(5);
		ls3.add(10);
		ls3.add(13);
		ls3.add(1);
		ls3.add(1);
        //sorted set
		//reverse the data : pass the Collections.reverseOrder() to the TreeSet constructor
		Set<Integer> ls4 = new TreeSet<Integer>(Collections.reverseOrder());

		ls4.add(3);
		ls4.add(5);
		ls4.add(10);
		ls4.add(13);
		ls4.add(1);
		ls4.add(1);
		
		

		System.out.println("List " + ls1);
		System.out.println("Set2 " + ls2);
		System.out.println("Set3 " + ls3);
		System.out.println("Set4 " + ls4);

	}
}
