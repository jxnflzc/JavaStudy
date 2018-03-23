package main;

import java.util.*;

public class CollectionToArray {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Java");
		al.add("C++");
		al.add("Python");
		
		String[] arr = al.toArray(new String[al.size()]);
		System.out.println(Arrays.toString(arr));
	}
}
