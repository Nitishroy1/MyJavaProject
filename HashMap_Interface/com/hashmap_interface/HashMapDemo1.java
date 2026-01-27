package com.hashmap_interface;
import java.security.KeyStore.Entry;
import java.util.*;

import java.util.HashMap;

public class HashMapDemo1 {
	void main() {
		HashMap<String , Integer> map=new HashMap<String, Integer>();
		map.put("HYD", 3432);
		map.put("chenay", 13432);
		map.put("Mumbay", 34365);
		map.put("HYD", 3432);
		map.put("puna", 8432);
		map.put("puna", 8432);
		
		map.forEach((k,v)->IO.println(k+" : "+v));
		Set<String>key =map.keySet();
		key.forEach(IO::println);
		Collection<Integer>key1 =map.values();
		key1.forEach(IO::println);
		
		var e=map.entrySet();
		Iterator<java.util.Map.Entry<String,Integer>> itr=e.iterator();
		itr.forEachRemaining(IO::println);
		
	}

}
