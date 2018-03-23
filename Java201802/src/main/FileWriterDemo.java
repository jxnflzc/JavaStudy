package main;

import java.io.*;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("demo.txt") ;
		
		fw.write("package main;\r\n" + 
				"\r\n" + 
				"import java.util.*;\r\n" + 
				"\r\n" + 
				"public class HashSetDemo {\r\n" + 
				"	public static void main(String[] args) {\r\n" + 
				"		\r\n" + 
				"	}\r\n" + 
				"}\r\n");
		fw.flush();
		//fw.close();
		fw.write("package main;\r\n" + 
				"\r\n" + 
				"import java.util.*;\r\n" + 
				"\r\n" + 
				"public class HashSetDemo {\r\n" + 
				"	public static void main(String[] args) {\r\n" + 
				"		\r\n" + 
				"	}\r\n" + 
				"}");
		fw.close();
	}
}
