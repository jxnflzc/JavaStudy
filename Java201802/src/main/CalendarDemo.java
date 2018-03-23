package main;

import java.util.*;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cc = Calendar.getInstance();
		cc.set(2017, 11, 31);
		print(cc);
	}
	public static void print(Calendar c) {
		int years = c.get(Calendar.YEAR);
		String[] months = {"1��", "2��", "3��", "4��", "5��", "6��", "7��", "8��", "9��", "10��", "11��", "12��"};
		int dates = c.get(Calendar.DATE);
		String[] days = {"", "������", "����һ", "���ڶ�", "������", "������", "������", "������"};
		System.out.println(years + "��" + months[c.get(Calendar.MONTH)] + dates + "�� " + days[c.get(Calendar.DAY_OF_WEEK)]);
	}
}
