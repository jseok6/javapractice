package ch07;

import java.awt.Component;

//�߻�Ŭ����
abstract class Abstract1 {
	//�߻�޼ҵ�
	abstract void prn();
	
}

class Normal1 extends Abstract1{
	@Override
	void prn() {//<�� �̰� ���ʿ� ���ϸ� ����������
	}
}

class MCompnent extends Component{
	
}

public class AbstractEx1 {

	public static void main(String[] args) {
		
		Abstract1 a;
		//a=new Abstract1(); �߻�Ŭ���� ��ü��������
		a= new Normal1();
		
	}

}
