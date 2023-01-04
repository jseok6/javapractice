package ch06;


//클래스선언->필드&메소드->객체생성(new,필드 및 메소드사용)
class Car2{
	String name;
	int speed;
	int gear;
	
	void stop()
	{
		speed=0;
	}
	
	
}
//클래스 선언종료
public class CarEx2 {

	public static void main(String[] args) {
		int a=10;
		int b=a+10;
		for (int i=0; i<100; i++)
		{
			Car2 cr2=new Car2();
			//System.out.println(cr2.toString());
		}
		//요청값 소문자-> 대문자로 출력
		String s="waerawerewar";
		System.out.println(s.toUpperCase());
		//32 10진수를 2진수로변환
		Integer i= new Integer(32);
		String str=i.toBinaryString(32);
		System.out.println(str);
		
	}

}
