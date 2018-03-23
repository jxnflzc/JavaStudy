package main;

import java.io.*;

public class IOExceptionDemo {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("demo.txt");
			fw.write("package main;\r\n" + 
					"\r\n" + 
					"import java.util.*;\r\n" + 
					"\r\n" + 
					"public class HashSetDemo {\r\n" + 
					"	public static void main(String[] args) {\r\n" + 
					"		\r\n" + 
					"	}\r\n" + 
					"}\r\n");
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			try {
				if(fw != null)
					fw.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
	}
}
