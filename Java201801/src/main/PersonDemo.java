package main;

import person.*;//引入"person"包下所有类
/**
 * 2018年1月
 * @author 廖志成
 * @version 0.5.0.1
 */
public class PersonDemo {
	public static void main(String[] args) {
		Student myself = new Student();
		System.out.println("姓名：" + myself.getName());
		System.out.println("年龄：" + myself.getAge());
		System.out.println("国家：" + myself.getCountry());
		System.out.println("成绩：" + myself.getGrade());
	}
}