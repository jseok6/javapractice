package ch12;

public class ThreadEx1 extends Thread {
	
	String name;
	
	public ThreadEx1(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++)
		{
			try {
				Thread.sleep(200);//Ʈ���� ĳġ ����� ���� 0.0��-��� ����� ���ߴ±��
				System.out.println(name+":"+i);
 			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx1 t1=new ThreadEx1("ù��°");
		ThreadEx1 t2=new ThreadEx1("�ι�°");
		t1.start();//���޼ҵ� ȣ��
		t2.start();

	}

}
