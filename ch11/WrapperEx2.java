package ch11;

public class WrapperEx2 {
	public static void main(String[] args) {
		char c1 = 'J';//��������?
		System.out.print(c1);
		if(Character.isLetter(c1))
			System.out.println(" : �����Դϴ�.");
		
		char c2 = 'a';//�빮������ �ҹ������� ?
		System.out.print(c2);
		if(Character.isLowerCase(c2))
			System.out.println(" : �ҹ����Դϴ�.");
		
		char c3 = '2';//��������?
		System.out.print(c3);
		if(Character.isDigit(c3))
			System.out.println(" : �����Դϴ�.");
		
		char c4 = ' ';//���鹮��?
		System.out.print(c4);
		if(Character.isWhitespace(c4))
			System.out.println(" : ���鹮���Դϴ�.");
		
		Long l;
		Boolean b;
		Short s;
		Double d;
		Float f;
		Byte bt;
		Integer i;
		Character c;
	}
}



