package ch08;

interface Interface2{
	int a=10;//�ʵ�� ������ ��� static final
	//void prn() {}//�Ϲ� �޼ҵ��� ����Ұ�
	void prn();
	
	
}
//�������̽����� ��Ӱ���
interface Interface2_1 extends Interface2{
	void prn1();
}

class Myclass3 implements Interface2_1{

	@Override
	public void prn() {
	}

	@Override
	public void prn1() {
	}
	
}


public class InterfaceEx2 {

	public static void main(String[] args) {

	}

}
