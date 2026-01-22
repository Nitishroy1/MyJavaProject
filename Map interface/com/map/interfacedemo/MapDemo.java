package com.map.interfacedemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	void main() {
		Map<String, String> map=new HashMap<>();
		map.put("nitish12@gmail.com", "NK123");
		map.put("raj12@gmail.com", "raj123");
		map.put("mohan12@gmail.com", "mohan123");
		map.put("pankaj12@gmail.com", "pankaj123");
		map.put("suman12@gmail.com", "suman124");
		map.putIfAbsent("mohan12@gmail.com", "mohan303");
		String val =map.get("nitish12@gmail.com");
		Object s=map.getOrDefault("mohan123@gmail.com", "Email is wrong");
		
		IO.println(s);
		IO.println(val);
		boolean ispresent=map.containsKey("nitish12@gmail.com");
		IO.println(ispresent);
		boolean iscontani=map.containsValue("NK1234");
		IO.println(iscontani);
		
		//IO.println(map);
		IO.println(map.size());
	}

}
