package ch06;

import java.awt.Dialog;

class Constructor2{
	//JVM�� �����ڰ� �ϳ��� ����Ǿ� ������ ����Ʈ ������ ���� ����.
	public Constructor2(int i)
	{
		
	}
	//���������Ϸ��� ����Ʈ������ ����
	public Constructor2()
	{
		
	}
}
public class ConstructorEx2 {

	public static void main(String[] args) {
		Constructor2 c1=new Constructor2();//����
		Constructor2 c2=new Constructor2(22);
		//��������:Dialog Ŭ������ ����Ʈ �����ڰ� �������� ����
		//Dialog d=new Dialog(); <�ѿ���
	}

}
