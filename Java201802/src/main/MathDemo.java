package main;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(2.16);//����ȡ��
		System.out.println(d1);//3.0
		double d2 = Math.floor(3.4);//����ȡ��
		System.out.println(d2);//3.0
		double d3 = Math.pow(2, 3);//�η�
		System.out.println(d3);//8.0
		
		for(int i = 0; i < 10; i++) {
			double d4 = (int)(Math.random() * 10 + 1);//�����
			System.out.println(d4);
		}
	}
}
