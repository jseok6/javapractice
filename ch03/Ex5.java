package ch03;

public class Ex5 {

	public static void main(String[] args) {
		//´ëÀÔ¿¬»êÀÚ
		int a=10;
		int b=5;
		a=a+10;
		System.out.println(a);
		b+=10;//b=b+10
		System.out.println(b);
		a/=5;
		System.out.println(a);
		b%=3;
		System.out.println(b);
		//»ïÇ×¿¬»êÀÚ
		int c=10;
		String s=(c%2==0)?"Â¦¼ö":"È¦¼ö";
		int d=(c>0)?c:-c;
		
	}

}
