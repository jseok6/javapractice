package ch08;

interface InterfaceA3{
	void prn1();
}
interface InterfaceB3{
	void prn2();
}

class Myclass implements InterfaceA3, InterfaceB3{

	@Override
	public void prn2() {
	}

	@Override
	public void prn1() {
	}
	
}

public class InterfaceEx3 {

	public static void main(String[] args) {

	}

}
