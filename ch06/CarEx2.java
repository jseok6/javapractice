package ch06;


//Ŭ��������->�ʵ�&�޼ҵ�->��ü����(new,�ʵ� �� �޼ҵ���)
class Car2{
	String name;
	int speed;
	int gear;
	
	void stop()
	{
		speed=0;
	}
	
	
}
//Ŭ���� ��������
public class CarEx2 {

	public static void main(String[] args) {
		int a=10;
		int b=a+10;
		for (int i=0; i<100; i++)
		{
			Car2 cr2=new Car2();
			//System.out.println(cr2.toString());
		}
		//��û�� �ҹ���-> �빮�ڷ� ���
		String s="waerawerewar";
		System.out.println(s.toUpperCase());
		//32 10������ 2�����κ�ȯ
		Integer i= new Integer(32);
		String str=i.toBinaryString(32);
		System.out.println(str);
		
	}

}
