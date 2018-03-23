package main;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(2.16);//向上取整
		System.out.println(d1);//3.0
		double d2 = Math.floor(3.4);//向下取整
		System.out.println(d2);//3.0
		double d3 = Math.pow(2, 3);//次方
		System.out.println(d3);//8.0
		
		for(int i = 0; i < 10; i++) {
			double d4 = (int)(Math.random() * 10 + 1);//随机数
			System.out.println(d4);
		}
	}
}
