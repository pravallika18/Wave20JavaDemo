package com.Stackroute.Pravallika.Maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Sync {
	public static void main(String args[])
	{
		
		Thread t=new Thread(new A1());
		Thread t1=new Thread(new A1());
		t.start();
		t1.start();
		
	
	}

}
class A1 extends Thread{
	public void show()
	{
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		Map<String,Integer> ht=new Hashtable<String,Integer>();
		
		map.put("BMW",15);
		map.put("AUDI",10);
		map.put("INNOVA", 30);
		
		ht.put("BMW",15);
		ht.put("AUDI",10);
		ht.put("INNOVA", 30);
		Iterator iterator = map.keySet().iterator();

		while (iterator.hasNext()) {
			map.put("INNOVA", 6);
			System.out.println(map.get(iterator.next()));
			
		}
		System.out.println("++++++++++++++++++++");
		
	Iterator iterator1 = ht.keySet().iterator();
		while (iterator1.hasNext()) {
			ht.put("AUDI", 5);
		System.out.println(map.get(iterator1.next()));
		
	}
		

	

	}
	public void run()
	{
		show();
	}
}

