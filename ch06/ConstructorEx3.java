package ch06;

class SuperClass3{//�θ�   SuperClass3�� �θ�� Object
	public SuperClass3() {
		super();
		System.out.println("Super ������");
	}
	
	
}
class SubClass3 extends SuperClass3{//�ڽ�
	public SubClass3() {
		super();//����:�ݵ�� �������� ù��° ���ο� �;ߵ�.
		System.out.println("Sub ������");
		
	}
}


public class ConstructorEx3 {

	public static void main(String[] args) {
		SubClass3 s1= new SubClass3();
		
	}

}
//�ڹ��� ��ü������ �θ�ü���� ���� �����ȴ�
//�׷��Ƿ� �θ�����ں��� ���� ����ǰ� �ڽĻ����ڴ� �������� �����
//Obj->Super->Sub