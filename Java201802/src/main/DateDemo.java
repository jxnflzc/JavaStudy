package main;

import java.util.*;
import java.text.*;

public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyÄêMMÔÂddÈÕE hh:mm:ss");
		String date = sdf.format(d);
		System.out.println(date);
	}
}
