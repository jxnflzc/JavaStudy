package main;

import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Students> ts = new TreeSet<Students>();
		
		ts.add(new Students("Java01", 20));
		ts.add(new Students("Java02", 25));
		ts.add(new Students("Java03", 14));
		ts.add(new Students("Java04", 21));
		
		for(Iterator<Students> it = ts.iterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}
	}
}

class Students implements Comparable<Object>{
	private String name;
	private int age;
	public Students(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		return 0;
	}
}
