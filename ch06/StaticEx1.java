package ch06;

public class StaticEx1 {

	/*static �ʵ� �� �޼ҵ�� ��ü�� �������� �ʾƵ� ��밡��
	 * ��������:Ŭ�����̸����� �����ϱ� ������ �׶� �޸𸮿� �ε�.
	 * */
	/*static �ʵ� �� �޼ҵ�� Ŭ������.�ʵ� or �޼ҵ� �϶�
	 * �޸� �ε��� ������ non-static �ʵ� �� �޼ҵ��
	 * �ݵ�� ��ü�� �����ؾ� �޸� �ε��ȴ�.
	 * �׷��� non-static �ʵ� �� �޼ҵ�� static �ʵ� �� �޼ҵ忡
	 * ��� �� �� ����.
	 * */
class Static1{
	/*static*/ int i=0;
	int j=0;
	
	/*static*/ void prn() {
		
	}
	void prn2() {
		
	}
	/*static*/ class inner{}//���� Ŭ���� �տ��� static �� �� ����.
}

	public static void main(String[] args) {
		int a=Math.abs(-6);
		int b=(int)Math.round(3.14);
		Integer i= new Integer(22);
		int c=i.parseInt("23");
		int d=Integer.parseInt("23");
		//�������� 5�� ���� ���̸� ���Ͻÿ�
		System.out.println(5*5*Math.PI);
		System.out.println();
	}

}
