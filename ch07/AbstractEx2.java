package ch07;

abstract class Abstract2{
	abstract void prn();
}


abstract class Abstract2_1 extends Abstract2{
	abstract void prn2();//추상 클래스끼리 상속가능
}

class Normal2 extends Abstract2_1 {

	@Override
	void prn() {     //반드시필요
	}
	
	@Override
	void prn2() {    //반드시필요
	}
	
}


public class AbstractEx2 {

	public static void main(String[] args) {

	}

}
