package com.Stackroute.Pravallika.Maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Failfast {

	public static void main(String[] args) {
//		Map<String, String> map1 = new Hashtable<String, String>();
//		map1.put("key1", "value1");
//		map1.put("key2", "value2");
//		map1.put("key3", "value3");
//
//		Iterator<String> iterator1 = map1.keySet().iterator();
//
//		while (iterator1.hasNext()) {
//			System.out.println(map1.get(iterator1.next()));
//			map1.put("key4", "value4");
//		}

		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");

		Iterator<String> iterator = map.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
			map.put("key4", "value4");
		}
		
	}

}