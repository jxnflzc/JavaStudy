package main;

import java.io.*;

public class FileReaderDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("demo.txt");
			/*while(true) {
				int ch = fr.read();
				if(ch != -1) {
					System.out.print((char)ch);
				} else break;
			}*/
			char[] word = new char[1024];
			int num = fr.read(word);
			for(int i = 0; i < num; i++) {
				System.out.print(word[i]);
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
	}
}
