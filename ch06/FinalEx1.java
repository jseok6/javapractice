package ch06;
/*final(������):Ŭ����,�ʵ�(�ν��Ͻ�����),�޼ҵ�
 * 1.Ŭ����:subŬ������ ���� Ŭ����
 * 2.�ʵ�:�������(�ʵ�,�Ű�����,��������)
 * 3.�޼ҵ�:�������̵��Ұ�
 * �������̵��̶�:����Ŭ�������� ������ �޼ҵ带 ����Ŭ�������� �������ϴ°�
 * */

final class Final1{
	
}

class Final3{
	static final int KIA=1;//����� ������ static�� ���δ�
	final int SK=2;//final�� ����ε� �ʱ�ȭ�� ������ �������.
	int k;
	public Final3() {
		//KIA=2; <��kia final�� �����߱� ������ ����
		System.out.println(k);
	}
	public void prn(final int a)
	{
		//a=10;
		final int b=10;
		//b=20; �������� �����ߴµ� final�� �տ� ����Ǿ��� ������ ����Ұ�
		int c;
		//System.out.println(c); ����
		int d=10;
		int e;
		e=10;
	}
}


class Final4{
	void prn1() {
		
	}
	final void prn2() {
		
	}
}
class Final5 extends Final4{
	@Override
	void prn1() {
		
	}
	
}
//class Final extends Final1{} ��ӺҰ���
public class FinalEx1 {

	public static void main(String[] args) {
		
	}

}
