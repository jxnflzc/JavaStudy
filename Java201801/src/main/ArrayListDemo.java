package main;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java01");
		al.add("Java02");
		al.add("Java01");
		al.add("Java03");
		al.add("Java01");
		al.add("Java04");
		
		System.out.println(al);
		System.out.println(singleElment(al));
	}
	
	public static ArrayList<Object> singleElment(ArrayList<String> al) {
		ArrayList<Object> newAl = new ArrayList<Object>();
		
		for(Iterator<String> it = al.iterator(); it.hasNext(); ) {
			Object obj = it.next();
			if(!newAl.contains(obj)) {
				newAl.add(obj);
			}
		}
		
		return newAl;
	}
}
