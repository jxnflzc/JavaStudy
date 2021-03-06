package main;

import java.io.*;

public class CopyTextDemo {
	public static void main(String[] args) throws IOException {
		//copy_1();
		copy_2();
	}

	public static void copy_1() throws IOException {
		FileWriter fw = new FileWriter("demos.txt");

		FileReader fr = new FileReader("demo.txt");
		int ch = 0;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}

		fw.close();
		fr.close();
	}

	public static void copy_2() {
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter("demos.txt");
			fr = new FileReader("demo.txt");

			char[] buf = new char[1024];

			int len = 0;

			while((len = fr.read(buf)) != -1) {
				fw.write(buf, 0, len);
			}
		} catch (IOException e) {
			//System.out.println(e.toString());
			throw new RuntimeException("��дʧ��");
		} finally {
			try {
				if(fr != null)
					fr.close();
			} catch (IOException e) {
			}

			try {
				if(fw != null)
					fw.close();
			} catch (IOException e) {
			}			
		}
	}
}
