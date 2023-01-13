package ch08;

abstract class Tv{
	String Color;
	boolean power;
	int channel;
	void poweronOffpower() {
		power=!power;
	}
	void upCh() {
		channel++;
	}
	void downCh() {
		channel--;
	}
	abstract void setModel();
}

class SMTv extends Tv implements RemoteControl{

	@Override
	void setModel() {
	}

	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}
	
}
class LGTv extends Tv implements RemoteControl{

	@Override
	void setModel() {
	}

	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}
	
}

interface RemoteControl{
	void turnOn();
	void turnOff();
}


public class InterfaceEx4 {

	public static void main(String[] args) {

	}

}
