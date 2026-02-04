package com.HashMape_with_list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Entrysetdemo {
	void main() {
		HashMap<Integer, String>map=new HashMap<Integer, String>();
		map.put(1, "m");
		map.put(2, "k");
		map.put(3, "p");
		
		
	 Set<Map.Entry<Integer, String>> itr	=map.entrySet();
	 Iterator<Entry<Integer, String>> itr2=itr.iterator();
	 itr2.forEachRemaining(IO::println);
	  var v=map.keySet();
	   v.forEach(IO::println);
	 
	}

}
