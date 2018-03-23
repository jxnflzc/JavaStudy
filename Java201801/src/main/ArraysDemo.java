package main;

import java.util.*;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] arr1 = {2, 3, 45};
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = {"Java", "C++", "Python"};
		System.out.println(Arrays.toString(arr2));
		List<String> list = Arrays.asList(arr2);
		System.out.println(list);
	}
}
