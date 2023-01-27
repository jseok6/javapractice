package ch12;

class NoThread2{
String name;
	
	public NoThread2(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

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
	public void start()
	{
		run();
	}
}


public class ThreadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoThread2 n1=new NoThread2("First");
		NoThread2 n2=new NoThread2("Second");
		n1.start();
		n2.start();
	}

}
