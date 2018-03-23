package main;

import java.io.IOException;

public class RuntimeDemo {
	public static void main(String[] args) throws IOException{
		Runtime r = Runtime.getRuntime();
		//System.out.println(r);
		r.exec("notepad.exe");
	}
}
