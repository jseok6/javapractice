package ch06;

class SuperClass4{//�θ�   SuperClass3�� �θ�� Object
	//super��� Ű���� �θ� ��Ī�ϴ°�.
	//Super�� �ݵ�� ù��° ���ο� �;ߵ�
	
	
	public SuperClass4(int i) {
		super();
		System.out.println("Super ������");
	}
	
	
}
class SubClass4 extends SuperClass4{//�ڽ�
	public SubClass4() {
		super(22);//������ �Ұ�����
		System.out.println("Sub ������");
		
	}
}
public class ConstructorEx4 {
 
	public static void main(String[] args) {

		SubClass4 s1= new SubClass4();
	}
 
}
 
//��ü�ּ� ��Ʈ��+shift+?
//�ּ� ��Ʈ��+/ 