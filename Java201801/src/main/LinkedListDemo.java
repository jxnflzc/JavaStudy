package main;

import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();

		link.addLast("Java01");
		link.add("Java02");
		link.add("Java03");
		link.addFirst("Java04");

		System.out.println(link);
	}
}
