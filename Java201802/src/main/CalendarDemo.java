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
		String[] months = {"1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月"};
		int dates = c.get(Calendar.DATE);
		String[] days = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
		System.out.println(years + "年" + months[c.get(Calendar.MONTH)] + dates + "日 " + days[c.get(Calendar.DAY_OF_WEEK)]);
	}
}
