package ch06;

class Constructor1 {//extends Object �����Ǿ�����
	//����Ʈ ������:�������� ������ jvm ������ ������ ����
	public Constructor1() {
		System.out.println("������ ȣ��");
	}
	public Constructor1(int i) {
		System.out.println("�Ű����� int ������ ȣ��");
	}
	public Constructor1(String s) {
		System.out.println("�Ű����� String ������ ȣ��");
	}
}


public class ConstructorEx1 {

	public static void main(String[] args) {
		//�����ڰ� ���� �����ϴ� ����:��ü�� �����Ǵ� �پ��� case������ ����
		Constructor1 c1= new Constructor1();
		Constructor1 c2= new Constructor1(22);
		Constructor1 c3= new Constructor1("����");
	}
}
