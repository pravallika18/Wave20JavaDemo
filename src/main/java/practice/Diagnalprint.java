package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class Diagnalprint {
	
	public static void main(String args[]) {
		int ar[][]= {{1,2},{3,4,32,54,34,4},{5,6,7,9},{32,24,322,254,324,422}};
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		ArrayList<Integer> outer;
		HashMap<Integer,Integer> store=new HashMap<>();
		HashMap<Integer,Integer> status=new HashMap<>();
		int i=0;
		for (int[] in : ar) {
			
			store.put(i, in.length);
			status.put(i, 0);
			i++;
			
		}
        for (int j=0;j<ar.length;j++) {
        	int[] inner=ar[j];
        	//System.out.println(status.get(j));
        	for(int innerl=status.get(j);innerl<inner.length;innerl++) {
        		if(innerl==0 && j==0) {
            		outer=new ArrayList<>();
            		outer.add(ar[j][innerl]);
            		list.add(outer);
            	}
            	else {
            		outer=new ArrayList<>();
            		outer.add(ar[j][innerl]);
            		int temp=1;
            		for(int k=j+1;k<ar.length;k++) {
            			
            			if(innerl-temp>=0&&store.get(k)>innerl-temp) {
            				
            			outer.add(ar[k][innerl-temp]);
            			status.put(k, innerl-temp+1);
            		//	System.out.println(status.toString());
            			}
            			temp++;
                		
            		}
            		list.add(outer);
            	}
        	}
        
        }	
        
        for (ArrayList<Integer> integer : list) {
			System.out.println(integer.toString());
		}
		
	}

}
