package ch06;
import ch06_1.Access3;

class Access4 extends Access3{
	//상속에서 public,protected까지 유산
	//private는 불가능
	public Access4() {
		int k=b+c;
		
	}
}

public class AccessEx4 {

	public static void main(String[] args) {
		Access3 ac=new Access3();
		//ac.c
	}

}
