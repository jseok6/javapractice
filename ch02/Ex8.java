package ch02;

public class Ex8 {

	public static void main(String[] args) 
	throws Exception{
		System.out.println("Ű���带 �Է��ϰ� Enter�ϼ���.");
		while(true) {
		int keyCode=System.in.read();
		System.out.println("keyCode:"+keyCode);
		if(keyCode==113) {
			break;
		}
		}//while
		System.out.println("����~");
	}
}

