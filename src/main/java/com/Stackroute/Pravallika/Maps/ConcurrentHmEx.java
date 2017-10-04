package com.Stackroute.Pravallika.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;



public class ConcurrentHmEx {
	public static void main(String[] args) {

		//ConcurrentHashMap
		Map<String,String> myMap = new ConcurrentHashMap<String,String>();
		myMap.put("BMW","15");
		myMap.put("AUDI","10");
		myMap.put("INNOVA", "30");
		
		System.out.println("ConcurrentHashMap before iterator: "+myMap);
		Iterator<String> it = myMap.keySet().iterator();

		while(it.hasNext()){
			String key = it.next();
			if(key.equals("BMW")) myMap.put(key+"new", "new3");
		}
		System.out.println("ConcurrentHashMap after iterator: "+myMap);

		//HashMap
		myMap = new HashMap<String,String>();
		myMap.put("BMW","15");
		myMap.put("AUDI","10");
		myMap.put("INNOVA", "30");
		
		System.out.println("HashMap before iterator: "+myMap);
		Iterator<String> it1 = myMap.keySet().iterator();

		while(it1.hasNext()){
			String key = it1.next();
			//System.out.println("========="+it1.next());
			if(key.equals("INNOVA")) myMap.put(key+"N", "newAUDI");
		}
		System.out.println("HashMap after iterator: "+myMap);
	}

}
