package main;

import java.io.*;

public class FileWriterDemo_2 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("demo.txt", true);
			fw.write("1213\r\n123");
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
