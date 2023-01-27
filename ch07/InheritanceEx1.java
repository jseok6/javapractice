package ch07;


class Car1{//2대클래스
	int velocity;
	void speedUp() {
		velocity++;
	}
	void speedDown() {
		velocity--;
		if(velocity<0)
		{
			velocity=0;
		}
	}
	void stop()
	{
		velocity=0;
	}
	
}
class Taxi1 extends Car1 {
	@Override
	void speedUp() {
		velocity+=5;
	}
}
class Bus1 extends Car1 {
	@Override
	void speedUp() {
		super.speedUp();//상위메소드호출
		if(velocity>100)
			velocity=100;
	}
}
public class InheritanceEx1 {

	public static void main(String[] args) {
		Taxi1 t =new Taxi1();
		t.speedUp();
		System.out.println(t.velocity);
		Bus1 b= new Bus1();
		b.velocity=110;
		b.speedUp();
		System.out.println(b.velocity);
	}

}
