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
				Thread.sleep(200);//트라이 캐치 사용한 이유 0.0초-잠시 기능을 멈추는기능
				System.out.println(name+":"+i);
 			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx1 t1=new ThreadEx1("첫번째");
		ThreadEx1 t2=new ThreadEx1("두번째");
		t1.start();//런메소드 호출
		t2.start();

	}

}
