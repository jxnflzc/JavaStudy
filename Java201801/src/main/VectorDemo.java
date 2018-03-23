package main;

import java.util.*;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Java01");
		v.add("Java02");
		v.add("Java03");
		v.add("Java04");
		System.out.println(v);
		//Ã¶¾Ù
		Enumeration<String> en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
