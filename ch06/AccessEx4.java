package ch06;
import ch06_1.Access3;

class Access4 extends Access3{
	//��ӿ��� public,protected���� ����
	//private�� �Ұ���
	public Access4() {
		int k=b+c;
		
	}
}

public class AccessEx4 {

	public static void main(String[] args) {
		Access3 ac=new Access3();
		//ac.c
	}

}
