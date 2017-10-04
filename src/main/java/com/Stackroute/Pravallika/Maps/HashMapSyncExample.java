package com.Stackroute.Pravallika.Maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
public class HashMapSyncExample {
    public static void main(String args[]) {
    	Thread t=new Thread(new Ex());
    	t.start();
    	
    	Thread t1=new Thread(new Ex());
    	
    	t1.start();
        
    }
}
class Ex extends Thread{
	public void show()
	{

     Map<Integer, String> hmap= new HashMap<Integer, String>();
     hmap.put(2, "Anil");
     hmap.put(44, "Ajit");
     hmap.put(1, "Brad");
     hmap.put(4, "Sachin");
     hmap.put(88, "XYZ");
System.out.println(hmap);
    Map map= Collections.synchronizedMap(hmap);
     Set set = hmap.entrySet();
     
         Iterator i = set.iterator();
         // Display elements
         while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() + ": "+me.getValue());
            hmap.put(1, "ss");
            
         }
     
    
	}
	public void run() {
		show();
	}
	
}