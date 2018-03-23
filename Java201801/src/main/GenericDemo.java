package main;

import java.util.*;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Java");
		al.add("C");
		al.add("C++");
		al.add("Python");
		al.add("Matlab");
		
		for(Iterator<String> it = al.iterator(); it.hasNext(); ) {
			String s = (String)it.next();
			
			System.out.println("\"" + s + "\"" + ":" + s.length());;
		}
		Generics g = new Generics();
		g.show(4399);
		g.show("I like Java!");
		g.print(4399);
		g.print("I like Java!");
	}
}

class Generics{
	public <T> void show(T t) {
		System.out.println("Show:" + t);
	}
	public <Q> void print(Q q) {
		System.out.println("Print:" + q);
	}
}