package ch09;

interface MyInter1{
	void prn();
}

abstract class MyAbst1{
	abstract void prn();
}

class A implements MyInter{
	
	public void prn() {
		System.out.println("�Ϲ����� ���� ���");
	}
}

class B extends MyAbst1{
	
	void prn() {
		
	}
}


public class AnonymousEx1 {

	public static void main(String[] args) {
		A a=new A();
		a.prn();
		B b=new B();
		b.prn();
		
		//Ŭ����ȭ�� ���� �ٸ������� ����� ������ �ƴ� ���⿡���� only ���
		new MyInter1() {
			
			@Override
			public void prn() {
				System.out.println("�͸�Ŭ���� ���� ���");
			}
		}.prn();;
		
		new MyAbst1() {
			@Override
			void prn() {
				System.out.println("�͸�Ŭ���� ���� ���2");
			}
		}.prn();
	}

}
