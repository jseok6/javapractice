package ch11;

public class StringEx3 {
	
	public static void main(String[] args) {
		String str = "�������̰� ��ȭ������ �һ���ȸ�� ����."
				 + "�������� 5�� ���� 3�� ���� �Ұ��� �Ե� ��ȭ��"
				 + " 8�� �̺�ƮȦ����... ���� �귣�� ������ȭ��" 
				 + " ȫ���� ���� �һ���ȸ�� �����Ѵ�.";
		int len = str.length();
		/*1��.���������� ���鹮���� index��ȣ�� ����Ͻÿ�.
		5, 11,......87, : hint : indexOf�� ����Ѵ�.*/
		int idx = -1;
		do {
			idx = str.indexOf(' ', idx+1);
			if(idx>=0) System.out.print(idx + ", ");
		} while (idx>=0);
		System.out.println();
		
		for (int i = 0; i < len; i++) {
			if(str.charAt(i)==' ')
				System.out.print(i + ", ");
		}
		System.out.println();
		/*2��.���������� ���鹮���� index��ȣ�� ����Ͻÿ�.
		87, 81, 78,....5,  : hint : lastIndexOf�� ����Ѵ�.*/
		idx = len;//str.length()
		do {
			idx = str.lastIndexOf(' ', idx -1);
			if(idx>=0) System.out.print(idx + ", ");
		} while (idx>=0);
		System.out.println();
		for (int i = len-1; i >=0 ; i--) {
			if(str.charAt(i)==' ')
				System.out.print(i + ", ");
		}
		System.out.println();
		/*3��.��ĭ�� '_' ����Ͻÿ�. hint:charAt*/
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			if(c!=' ') System.out.print(c);
			else System.out.print('_');
		}
		System.out.println();
		System.out.println(str.replace(' ', '_'));
		/*4�� ù�ܾ� ����ϱ� : substring, indexOf*/
		int a = str.indexOf(' ');
		String str2 = str.substring(0, a);
		System.out.println("str2 : " + str2);
		
		/*5�� �������ܾ� ����ϱ� : substring, lastIndexOf*/
		int b = str.lastIndexOf(' ') + 1;
		String str3 = str.substring(b, len);
		System.out.println("str3 : " + str3);
	}
}