package com.hashmap_interface;

import java.util.HashMap;

public class HashMapNOoFSameSentance {
	void main() {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		String str="java is a java is a best best language and I am a java developer";
		String [] str1=str.split(" ");
		for(String s: str1) {
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		IO.println("Word frequny: "+ map);
	}

}
