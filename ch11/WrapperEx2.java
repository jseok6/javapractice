package ch11;

public class WrapperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1='J';
		System.out.println(c1);
		if(Character.isLetter(c1))
			System.out.println(": 문자입니다.");
		
		
		char c2='a';
		System.out.print(c2);
		if(Character.isUpperCase(c2))//isLowerCase
			System.out.println(":대문자입니다.");
		else {
			System.out.println(":소문자입니다.");
		}
		
		char c3='2';
		System.out.print(c3);
		if(Character.isLetter(c3))//isDigit
			System.out.println(":문자입니다.");
		else {
			System.out.println(":숫자입니다.");
		}
		
		
		
		char c4=' ';
		System.out.print(c4);
		if(Character.isSpace(c4))//isWhitespace
			System.out.println(":공백입니다");
		
		
		System.out.println(Double.MAX_VALUE);
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
