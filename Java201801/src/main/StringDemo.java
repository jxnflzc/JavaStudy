package main;

public class StringDemo {
	public static void main(String[] args){
		String s1 = "Hello World!";
		System.out.println(s1.length());//12
		System.out.println(s1.charAt(8));//r
		System.out.println(s1.indexOf("o"));//4
		System.out.println(s1.indexOf("o", 4));//4
		System.out.println(s1.indexOf("o", 5));//7
		
		String s2 = "I like C++ and Java!";
		System.out.println(s2.startsWith("I"));//true
		System.out.println(s2.endsWith("!"));//true
		System.out.println(s2.isEmpty());//false
		System.out.println(s2.contains("Java"));//true
		byte[] b = s2.getBytes();
		for(int i = 0; i < b.length; i++) {
			if(i != b.length - 1) {
				System.out.print(b[i] + ",");
			} else {
				System.out.println(b[i] + ".");
			}
		}
		System.out.println(s2.replace("Java", "Python"));//I like C++ and Python!
		
		String s3 = "C,C++,Java,Python,HTML,Ruby,Javascript";//
		String arr[] = s3.split(",");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(s3.substring(2));//C++,Java,Python,HTML,Ruby,Javascript
		System.out.println(s3.substring(2, 4));//C+
		System.out.println(s3.substring(2, s3.length()));//C++,Java,Python,HTML,Ruby,Javascript
		System.out.println(s3.toLowerCase());//c,c++,java,python,html,ruby,javascript
		System.out.println(s3.toUpperCase());//C,C++,JAVA,PYTHON,HTML,RUBY,JAVASCRIPT
		
		String s4 = " C++ Java Python ";
		System.out.println(s4.trim());//C++ Java Python

	}
}
