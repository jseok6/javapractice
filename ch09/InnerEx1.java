package ch09;
/*����(��øŬ����)
 * 1.Ŭ���� �ȿ� ����(��κ�)
 * 2.Ŭ�����ȿ� ���������� static Ŭ���� ����(Ȱ�뵵�� ���� ����)
 * 3.�޼ҵ� �ȿ� Ŭ���� ����(Ȱ�뵵 ��������)
 * 4.�͸�Ŭ����(�޼ҵ�ȿ� ������ �ϰ� ����� ���� ����) (Ȱ�뵵 ��κ�)
 * 1��4�� �ַ� ���
 * 
 * */
interface MyInter{
	void prn();
}


class Outer1{
	class Inner1{
		
	}
	static class Inner2{
		
	}
	//�޼ҵ� �ȿ� �޼ҵ�� ���� �Ұ���
	//�޼ҵ� �ȿ� Ŭ������ ������ ������
	void prn() {
		class Inner3{
			
		}
		new MyInter() {
			@Override
			public void prn() {
				
			}
		};
		 
	}
}


public class InnerEx1 {

	public static void main(String[] args) {

	}

}

