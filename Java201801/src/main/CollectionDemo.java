package main;

import java.util.*;

public class CollectionDemo {
	public static void main(String[] args) {
		//method_1();
		//method_get();
		//method_list();
		method_it();
	}
	
	public static void method_it() {
		ArrayList<String> al = new ArrayList<String>();

		al.add("Java01");
		al.add("Java02");
		al.add("Java03");
		al.add("Java04");

		System.out.println(al);

		for(ListIterator<String> li = al.listIterator(); li.hasNext(); ) {
			if(li.next().equals("Java02")) {
				li.add("Java05");
			}
			if(li.next().equals("Java04")) {
				li.set("Java05");
			}
		}
		System.out.println(al);
	}
	
	public static void method_list() {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Java01");
		al.add("Java02");
		al.add("Java03");
		al.add("Java04");
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println("al.get(" + i + ")=" + al.get(i));
		}
		
		System.out.println("原集合:" + al);
		al.add(1, "Java");
		System.out.println("现集合:" + al);
		al.remove(3);
		System.out.println("现集合:" + al);
	}
	
	public static void method_get() {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Java01");
		al.add("Java02");
		al.add("Java03");
		al.add("Java04");
		
		System.out.println(al);
		
		for(Iterator<String> it = al.iterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}
	}
	
	public static void method_1() {
		ArrayList<String> al1 = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
		
		al1.add("Java01");
		al1.add("Java02");
		al1.add("Java03");
		al1.add("Java04");
		al2.add("Java03");
		al2.add("Java04");
		al2.add("Java05");
		
		System.out.println("集合长度:" + al1.size());
		System.out.println("原集合:" + al1);
		
		al1.remove("Java02");
		System.out.println("现集合:" + al1);
		System.out.println("集合是否有\"Java03\":" + al1.contains("Java03"));
		
		al1.retainAll(al2);
		System.out.println(al1);
		System.out.println(al2);
		
		al1.add("Java01");
		al1.add("Java02");
		al1.removeAll(al2);
		System.out.println(al1);
		System.out.println(al2);
	}
}
