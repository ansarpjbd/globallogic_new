package com.globallogic.day9;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queue {
	
	public static void main(String[] args) {
		
		java.util.Queue<Integer> q=new PriorityQueue<Integer>();
		
		q.add(1);
		q.add(2);
		q.add(4);
		q.add(5);
		//System.out.println(q.peek());
		//System.out.println(q.poll());
	
		
		
		System.out.println(q);
		
		
	java.util.Queue<Integer> q1=new ArrayDeque<Integer>();
		
		q1.add(1);
		q1.add(2);
		q1.add(4);
		q1.add(5);
		//System.out.println(q.peek());
		//System.out.println(q.poll());
		System.out.println(q1);
	
	}

}
