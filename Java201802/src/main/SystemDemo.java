package main;

import java.util.*;

public class SystemDemo {
	public static void main(String[] args){
		Properties prop = System.getProperties();
		//System.out.println(prop);
		
		prop.setProperty("mykey", "myvalue");
		for(Object obj : prop.keySet()) {
			String value = (String)prop.get(obj);
			System.out.println(obj + "::" + value);
		}
		System.out.println(prop.getProperty("mykey"));
	}
}
