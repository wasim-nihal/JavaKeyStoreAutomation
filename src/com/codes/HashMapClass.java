package com.codes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "aaa");
		hm.put(2, "bbb");
		hm.put(3, "ccc");
		hm.put(4, "ddd");
		hm.put(5, "eee");
		
		System.out.println(hm.get(4));
		
		Set<Entry<Integer, String>> s=hm.entrySet();
		
		Iterator<Entry<Integer, String>> i=s.iterator();
		while(i.hasNext()) {
			Map.Entry<Integer,String> mp= i.next();
			System.out.println(mp.getKey()+"   "+mp.getValue());
			
		}
		

	}

}
