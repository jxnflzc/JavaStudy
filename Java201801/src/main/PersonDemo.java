package main;

import person.*;//����"person"����������
/**
 * 2018��1��
 * @author ��־��
 * @version 0.5.0.1
 */
public class PersonDemo {
	public static void main(String[] args) {
		Student myself = new Student();
		System.out.println("������" + myself.getName());
		System.out.println("���䣺" + myself.getAge());
		System.out.println("���ң�" + myself.getCountry());
		System.out.println("�ɼ���" + myself.getGrade());
	}
}