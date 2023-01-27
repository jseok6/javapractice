package ch08;

interface Interface2{
	int a=10;//필드는 무조건 상수 static final
	//void prn() {}//일반 메소도는 선언불가
	void prn();
	
	
}
//인터페이스끼리 상속가능
interface Interface2_1 extends Interface2{
	void prn1();
}

class Myclass3 implements Interface2_1{

	@Override
	public void prn() {
	}

	@Override
	public void prn1() {
	}
	
}


public class InterfaceEx2 {

	public static void main(String[] args) {

	}

}
