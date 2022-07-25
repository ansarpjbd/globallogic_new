package com.globallogic.demo10;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * @author ravin
 * key should not have the null value
 */

//List --it can hold one data 
//SET--it also can hold one data 
//string, list , double ,float
//String     //Integter 
//key   and   value 
//Name    and roll
//kumar   and  1
//java		   2
//ravinder     3


public class MyMap {

	public static void main(String[] args) {
		
		//List<E>
		/**
		 * Hashtable: it will not maintain the order
		 * it is thread safe (Synchronzied)
		 * HashMap: it is not thread safe that means it is not Synchronzied
		 * LinkedHashMap: it will maintain the order
		 * 
		 * TreeMap: it will store the data in stored order with key
		 */
		Map<String, Integer> map=new TreeMap<String, Integer>();
		
		//Key it will again use the set
		
		//in map you have put method to add the value
		map.put("ravinder", 1);
		map.put("kumar", 2);
		map.put("aumar", 5);
		map.put("zava ", 3);
	//	map.put(null, 3);
		/**
		 * it will take the key and search in the map
		 * if key found then it will return true otherwise it will return false
		 */
		map.containsKey("kumar");
		
		
		/**
		 * it will check given value is there in value of map
		 */
		map.containsValue(1);
		
		System.out.println(map);
		
		//it will return the all the keys
		Set<String> keys=map.keySet();
		for(String key: keys)
		{
			System.out.println("keys "+key +" value "+map.get(key));
			//System.out.println();
		}
		//one value a  time
		//System.out.println(map.get("kumar"));
		
		//entry set is interface which has the get-key and key-value method is there
		
		for(Map.Entry<String, Integer>  entry:map.entrySet())
		{
			//System.out.println("Key "+entry.getKey() +" value "+entry.getValue());
		}
	}
	
}
