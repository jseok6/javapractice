package ch07;

class Animal{
	void move() {
		System.out.println("������ ��������");
	}
	
}
class Bird extends Animal{
	String name="��";
	@Override
	void move() {
		//super.move();
		System.out.println(name+"���ƶ�~");
	}
}
class Fish extends Animal{
	String name="�����";
	@Override
	void move() {
		//super.move();
		System.out.println(name+"����Ķ�~");
	}
}
class Cheetah extends Animal{
	String name="ġŸ";
	@Override
	void move() {
		//super.move();
		System.out.println(name+"�޷���~");
	}
}


public class CastingEx3 {

	public static void main(String[] args) {
		//�ִϸ� Ÿ���� ��ü�� ���� �� �� �ִ� ĭ�� 3�� ����
		Animal ani[]=new Animal[3];
		ani[0]=new Bird();
		ani[1]=new Fish();
		ani[2]=new Cheetah();
		for (int i=0; i<ani.length; i++) {
			ani[i].move();//���� ���ε�:���� Ŭ������ �޼ҵ带 ȣ��
		}
		
	}

}
