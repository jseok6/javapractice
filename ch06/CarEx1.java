package ch06;



//Ŭ���� ���� Ŭ������ ���� Ǯ����:ch06.Car1
//Ŭ����:��ü�� ����� Ʋ(ex-�ؾ Ʋ)
class Car1/*Ŭ������*/{
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
//.java�� ����� Ŭ������ public ��밡��
public class CarEx1 {

	public static void main(String[] args) {
		
		int arr[]=new int[3];
		System.out.println(arr.length);
		String str="������ �޴��� ������";
		System.out.println(str.length());
		
		
		//��ü ����
		Car1 c1=new Car1();
		c1.carName="�ҳ�Ÿ";
		c1.carColor="����";
		c1.speedUp();
		System.out.println(c1.carName);
		System.out.println(c1.carColor);
		System.out.println(c1.velocity);
		

	}

}
/*Module java.base
Package java.lang
Class String*/
