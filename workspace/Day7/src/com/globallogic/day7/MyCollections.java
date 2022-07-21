package com.globallogic.day7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

//Collections : it is collections of classes 
//collections have parent interface as iterable
//iterable--->collection(I)

//List: it is used to store the data in array form
//internally list use the array data
//list can hold the duplicate data 

//Generic class : it is class which allows to take the data as parameters with class

//receive the data type with class name
//x is a variable which is capable of holding the data type
//For generic class you cannot pass the primitive data type
class Employee<X, Y, Z> {
	X id;
	Y name;
	Z salary;

	public Employee(X id, Y name, Z salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void print() {
		System.out.println("Id " + this.id);
		System.out.println("name " + this.name);
		System.out.println("salary " + this.salary);
	}
}

public class MyCollections {

	public static void main(String[] args) {

		Employee ravinder = new Employee(1001, "Ravinder ", 10000);

		// later there is requirement that id also be as string type and slary also be
		// string type for some object
		// ArrayList<>i
		// able to pass the data-type with the class while creating the object
		Employee<String, String, String> kumar = new Employee<String, String, String>("1001", "Ravinder ", "10000");
		Employee<Integer, Integer, Integer> kumar2 = new Employee<Integer, Integer, Integer>(1001, 100, 10000);
		//ravinder.print();
		//kumar.print();
	//	kumar2.print();
		//first size is 10 
		//dymanic array 
		//vector is thread safe 
		Stack<String> ls = new Stack<String>();
		// add method is use to add the value to list
		ls.add("ravinder");
		ls.add("kumar");
		ls.add("ajay");
		ls.add("zee");
		
		
		//ls.addFirst("Hello");
		//ls.addLast("last");
		//add the element at the tail or last 
		//Adds the specified element as the tail (last element) of this list.
		//return true if element is add
		//return false if not added
		//ls.offer("hello");
		//Inserts the specified element at the front of this list
		//ls.offerFirst("hello");
		//Inserts the specified element at the end of this list
		//ls.offerLast("java");
		//*hello java
		//Retrieves, but does not remove, the head (first element) of this list.
		//ls.element();
		
		/**
		 * Retrieves and removes the head (first element) of this list 
		  */
		
		/**
	     * Removes all of the elements from this list.
	     * The list will be empty after this call returns.
	     */
		
		//ls.poll();
		//return and remove the first element
		//ls.pollFirst();
		//return and remove the last element 
		//ls.pollLast();
		
		//Retrieves, but does not remove, the head (first element) of this list
		ls.peek();
		//return and does not remove it
		//ls.peekFirst();
		//return the last element and does not remove
		//ls.peekLast();
		
		ls.push("hello");
		//return the element from top
		
		//Removes the object at the top of this stack and returns that bject as the value of this function.
		ls.pop();
		//Returns the last component of the vector.
		ls.lastElement();
		
		//Looks at the object at the top of this stack without removing it from the stack
	    ls.peek();
	   
		//it will return the list in desecending order
		//Iterator<String> its=ls.descendingIterator();
		
		//ls.
		
		
		ls.add(0, "hello");
		//adding you before iterator
		
		ListIterator<String > it=  ls.listIterator();
		//it will check there is any next element is there or not
		//it will return true if there is any element
		//it will return false if there is not element
		
		//Collections.sort(ls);
		
		
		while(it.hasNext())
		{
			//String element=it.next();
			System.out.println("element is "+it.next());
			//it.set(null);
			
		}
		it.add("value");
		//it will clear the list
		//it will delete all the element of list
		//ls.clear();
		
		//contain --it will search for matching element in the list
		//return true if the element matches
		//return the false if there is no matching element
       //   System.out.println(ls.contains("zee1"));
		
		
		// it will use the toString method to print it
		//System.out.println(ls);

		/*
		 * for (String obj : ls) { System.out.println(obj); }
		 */
		//it will take the lambda a input and print the value
		//ls.forEach(e->System.out.println(e));
		//ls.forEach(System.out::println);
		
		//use to get the value from list using index
		//System.out.println(ls.get(0));
		
		
		//it will remove the data using index
		//ls.remove(0);
		
		//sort the data in the list
		//Collections.sort(ls,Collections.reverseOrder());
		
		//System.out.println(ls);
		
		//it will check list is empty or not
		//ls.isEmpty();
		
		//ls.
	}
}
