package ch06;


class Car3/*클래스명*/{
	//필드:객체의 속성<ㅡ 무조건 ()는 없다.
	String carName;
	int velocity;
	String carColor;
	//메소드:객체의 기능<ㅡ 반드시 ()가 있다.
	void speedUp() {
		velocity++;
	}
	void speedDown() {
		velocity--;
		if(velocity<0)
			velocity=0;
	}
	void stop() {
		velocity=0;
	}
}


public class CarEx3 {

	public static void main(String[] args) {
		//주소에 의한 참조(call by reference)
/*		Car3 c1=new Car3();
		Car3 c2=new Car3();
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		c2=c1;//참조형의'='은 call by reference 방식
		System.out.println(c1.toString());
		System.out.println(c2.toString()); */
		//
		Car3 c1=new Car3();
		Car3 c2=new Car3();
		c1.carName="아반떼";
		c2.carName="소나타";
		System.out.println("c1:"+c1.carName);
		System.out.println("c2:"+c2.carName);
		c2=c1;
		System.out.println("c1:"+c1.carName);
		System.out.println("c2:"+c2.carName);
		c1.carName="그렌져";
		System.out.println("c1:"+c1.carName);
		System.out.println("c2:"+c2.carName);
		//값에 의한 참조(call by value)
		int a=10;
		int b=a;//자바 기본형: 값에 의한참조
		a=20;
		System.out.println(a+b);
	}

}
