package ch11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		//1970�� 1��1�� �� 1/1000
		System.out.println(System.currentTimeMillis());
		SimpleDateFormat sdf = 
	new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String str = sdf.format(d);
		System.out.println(str);
		
	}
}

