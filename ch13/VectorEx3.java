package ch13;

import java.util.Vector;

public class VectorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vlist=new Vector(4,3);
		System.out.println(vlist.capacity());
		for(int i=0; i<10; i++)
		{
			vlist.add(i*10);
		}
		System.out.println(vlist.size());
		System.out.println(vlist.capacity());
		System.out.println("ù��° ���:"+vlist.firstElement());
		System.out.println("������ ���:"+vlist.lastElement());
		System.out.println("�ι�° ���:"+vlist.elementAt(1));
		System.out.println(vlist.isEmpty());
		vlist.remove(2);//����° ��� ����
		System.out.println(vlist.size());//��Ұ� �ϳ� �پ�� 9
		System.out.println(vlist.capacity());//���� ������ 10����
		vlist.trimToSize();//�ʿ���� �뷮 ����
		if(vlist.contains(50))//����� ��ü ã�¿��
		{
			System.out.println("����� ��ü");
		}
		vlist.removeAllElements();//��� ��� ����
	}

}
