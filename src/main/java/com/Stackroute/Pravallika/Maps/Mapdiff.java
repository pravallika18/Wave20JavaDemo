package com.Stackroute.Pravallika.Maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapdiff {
	public static void main(String args[])
	{
		//unsorted,unordered
		//it will accept null value
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	
	//Thread safe,Synchronized
	//it won't allow null value
	Map<String,Integer> ht=new Hashtable<String,Integer>();
	ht.put("", 4);
	ht.put("", 3);
	//ht.put(null, 1);
	System.out.println(ht.get(""));
	
	//unsorted
	//It will follow insertion Order
	LinkedHashMap<String,Integer> lhm1=new LinkedHashMap<String,Integer>();
	
	//sorted
	TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
	
    hm.put("A",2);
    hm.put("N",3);
    hm.put("F",3);
    hm.put("S",3);
    hm.put(null,3);
    hm.put(null, 6);
   
    lhm1.put("A",2);
   lhm1.put("N",3);
    
    lhm1.put("F",3);
    lhm1.put("S",3);
    
    tm.put("Z",3);
    tm.put("N", 45);
    tm.put("F", 21);
    tm.put("S", 23);
    System.out.println("===HashMap will take random order====");
    System.out.println(hm);
    System.out.println("===LinkedHashMap will take insertion order====");
    System.out.println(lhm1);
    System.out.println("===TreeMap will take values in sorted order====");
    System.out.println(tm);
    
	}
}
