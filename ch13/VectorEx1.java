package ch13;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vlist=new Vector();
		System.out.println(vlist.size());//����ִ���
		System.out.println(vlist.capacity());//��� ������
		vlist.add(new String("����"));
		vlist.add("����");
		vlist.add(Integer.valueOf(22));
		vlist.add(23);
		System.out.println(vlist.size());
		//�迭�� Vector �ؿ��� �׻� for �ִ�
		for(int i=0; i<vlist.size(); i++) {
			System.out.println(vlist.get(i));//vlist ��ҵ� ���� ���
		}
		System.out.println("==================");
		
	}

}
