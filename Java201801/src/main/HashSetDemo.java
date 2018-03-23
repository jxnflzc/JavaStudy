package main;

import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Java01");
		hs.add("Java02");
		hs.add("Java03");
		hs.add("Java04");
		
		for(Iterator<String> it = hs.iterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}
	}
}
