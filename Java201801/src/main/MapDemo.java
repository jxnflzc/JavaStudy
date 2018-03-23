package main;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("01", "Java01");
		map.put("02", "Java02");
		map.put("03", "Java03");
		map.put("04", "Java04");
		
		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.get("02"));
	}
}
