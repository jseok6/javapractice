package ch12;

public class RunnableEx1 implements Runnable {
	
	String name;
	
	public RunnableEx1(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
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
		RunnableEx1 r1= new RunnableEx1("�ϳ�");
		RunnableEx1 r2= new RunnableEx1("��");
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();//JVM�ȿ� �ִ� Thread �����ٷ� ���
		t2.start();
		

	}

}
