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
				Thread.sleep(200);//트라이 캐치 사용한 이유 0.0초-잠시 기능을 멈추는기능
				System.out.println(name+":"+i);
 			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableEx1 r1= new RunnableEx1("하나");
		RunnableEx1 r2= new RunnableEx1("둘");
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();//JVM안에 있는 Thread 스케줄러 등록
		t2.start();
		

	}

}
