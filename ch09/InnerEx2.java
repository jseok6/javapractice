package ch09;

class Outer2{
	int a=22;
	void p() {
		System.out.println("a="+a);
		//���� Ŭ������ �ܺ�Ŭ���� �������� �Ϲ������� ����� �ϰ� 
		//����� ������ ���谡 �ִ� ����� Ŭ������ ����
	}
	class Inner2{
		int b=23;
		void p1() {
			p();
			System.out.println("a+b="+(a+b));
		}
	}//Inner2
}
//�ܺ�Ŭ������ ����Ŭ������ �ҷ��ü������� ����Ŭ������ �ܺ�Ŭ������ �ҷ��ü��մ�

public class InnerEx2{

	public static void main(String[] args) {
		//�Ϲ������� ����Ŭ������ �ٸ� Ŭ�������� �����ϰ� ����ϴ°��� ���� ����
		//��3�� Ŭ������ ����
		Outer2 out=new Outer2();
		Outer2.Inner2 in=out.new Inner2();
		in.p1();
	}

}