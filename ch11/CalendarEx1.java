package ch11;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.print("������ ��¥�� ");
		System.out.print(cal.get(Calendar.YEAR)+"�� ");
		System.out.print(cal.get(Calendar.MONTH)+1+"�� ");
		System.out.print(cal.get(Calendar.DATE)+"�� ");
		System.out.println();
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int ampm = cal.get(Calendar.AM_PM);
		if(ampm==Calendar.AM)
			System.out.print("���� �ð��� AM ");
		else
			System.out.print("���� �ð��� PM ");
		System.out.println(hour +"�� " + min +"�� " + sec +"��");
		
	}

}
