package ch08;


//�ٸ�Ŭ���� ����ߴٰ� �����ϰ�
public class InterfaceEx6 implements Runnable{
	String name;
	
	
	public InterfaceEx6(String name) {
		this.name=name;
	}
	
	
	@Override
	public void run() {
		for (int i=0; i<10; i++)
		{
			System.out.println(i+":"+name);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		InterfaceEx6 a= new InterfaceEx6("ù��°");
		InterfaceEx6 b= new InterfaceEx6("�ι�°");
		new Thread(a).start();//��������� run�޼ҵ� ȣ��
		new Thread(b).start();

	}

}
