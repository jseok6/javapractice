package ch06;


class Car3/*Ŭ������*/{
	//�ʵ�:��ü�� �Ӽ�<�� ������ ()�� ����.
	String carName;
	int velocity;
	String carColor;
	//�޼ҵ�:��ü�� ���<�� �ݵ�� ()�� �ִ�.
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
		//�ּҿ� ���� ����(call by reference)
/*		Car3 c1=new Car3();
		Car3 c2=new Car3();
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		c2=c1;//��������'='�� call by reference ���
		System.out.println(c1.toString());
		System.out.println(c2.toString()); */
		//
		Car3 c1=new Car3();
		Car3 c2=new Car3();
		c1.carName="�ƹݶ�";
		c2.carName="�ҳ�Ÿ";
		System.out.println("c1:"+c1.carName);
		System.out.println("c2:"+c2.carName);
		c2=c1;
		System.out.println("c1:"+c1.carName);
		System.out.println("c2:"+c2.carName);
		c1.carName="�׷���";
		System.out.println("c1:"+c1.carName);
		System.out.println("c2:"+c2.carName);
		//���� ���� ����(call by value)
		int a=10;
		int b=a;//�ڹ� �⺻��: ���� ��������
		a=20;
		System.out.println(a+b);
	}

}
