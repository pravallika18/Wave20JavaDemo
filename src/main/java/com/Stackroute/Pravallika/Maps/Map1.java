package com.Stackroute.Pravallika.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
	public static void main(String args[])
	{
		Map<String,Integer> map=new HashMap<String,Integer>();
		Map<String,Integer> map1=new HashMap<String,Integer>();
		
		//V put(K key,V value)
		
		map.put("BMW",15);
		map.put("AUDI",10);
		map.put("INNOVA", 10);
		
		//void putAll(Map<? extends	k,? extends V> mapobject)
		System.out.println("Putting All map entries in map1:");
		map1.putAll(map);
		System.out.println(map1);
		
		//boolean containsKey(KeyValue)
		System.out.println("map contains BMW as key:");
		System.out.println(map.containsKey("BMW"));
		
		//boolean containsValue(KeyValue)
		System.out.println("map contains 10 as value:");
		System.out.println(map.containsValue(10));
		
		//size()
		System.out.println("Size of the map:");
		System.out.println(map.size());
		
		//remove(keyvalue)
		System.out.println("Removing entry from map:");
		System.out.println(map.remove("AUDI"));
		
		//get(keyValue)
		System.out.println("Trying to get removed value:");
		System.out.println(map.get("AUDI"));
		
		//getting KeySet
		System.out.println("Getting keyset from Map:");
		Set<String> s=map1.keySet();
		System.out.println(s);
		
		//getting keyValues
		System.out.println("getting values from map:");
		Collection<Integer> k=map1.values();
		System.out.println(k);
		
		
		//entryset
		System.out.println("Retrieving entries from map:");
		Set<Map.Entry<String,Integer>> entry=map1.entrySet();
		System.out.println(entry);
		
		
		
		
	}

}
