package ch11;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "Java Programming";
		
		int len = str.length();
		System.out.println("len : " + len);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		String str2 = str.substring(5);
		String str3 = str.substring(5, 10);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		//8��° ����
		char c1 = str.charAt(8);
		System.out.println("8��° ���� : " + c1);
		//¦�� �ڸ� ���ڸ� ����Ͻÿ�.
		for (int i = 0; i < str.length(); i++) {
			if(i%2==0)
				System.out.print(str.charAt(i));
		}
		//a���ڴ� ���° �ڸ��� �ִ°�?
		//Java Programming
		int idx1 = str.indexOf('a');
		System.out.println("\n"+"idx1 : " + idx1);
		int idx2 =  str.lastIndexOf('a');
		System.out.println("idx2 : " + idx2);
		//a�� q�� ��ȯ ����Ͻÿ�. : charAt , ?
		String str4 = str.replace('a', 'q');
		System.out.println(str4);
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='a') {
				System.out.print('q');
			}else {
				System.out.print(str.charAt(i));
			}
		}//--for
		System.out.println("------------------------");
		//str�� �ݴ�� ��� : chatAt, ?
		for (int i = len-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		StringBuffer sb = new StringBuffer(str);
		System.out.println("\n"+sb.reverse());
		
		String str5 =  "Java&JSP&Android&Iot&Spring";
		String str6[] = str5.split("&");
		for (int i = 0; i < str6.length; i++) {
			System.out.println(str6[i]);
		}
		String str7 = "          JSPStudy           ";
		System.out.println("***"+str7.trim()+"***");
		int idx3 = 22;//������ ���ڷ� ��ȯ
		String str8 = String.valueOf(idx3);
		String str9 = idx3+"";
		System.out.println(str8 + " : " + str9);
	}
}
