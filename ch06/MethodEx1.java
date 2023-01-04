package ch06;

class Method1{
	int abs(int num)
	{
		if (num<0)
		{
			num=-num;
		}
		return num;
	}
	
	void prn(int a, int b)
	{
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}
}


public class MethodEx1 {

	public static void main(String[] args) {
		Method1 m= new Method1();
		int a=m.abs(-10);//리턴형이 있는 메소드라도 값을 반드시 받을 필요가 없다.
		System.out.println(a);//out은 필드 println은 메소드
		m.prn(10, 20);
	}

}
