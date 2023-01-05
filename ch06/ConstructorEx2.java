package ch06;

import java.awt.Dialog;

class Constructor2{
	//JVM은 생성자가 하나라도 선언되어 있으면 디폴트 생성자 제공 안함.
	public Constructor2(int i)
	{
		
	}
	//오류수정하려면 디폴트생성자 정의
	public Constructor2()
	{
		
	}
}
public class ConstructorEx2 {

	public static void main(String[] args) {
		Constructor2 c1=new Constructor2();//오류
		Constructor2 c2=new Constructor2(22);
		//오류이유:Dialog 클래스는 디폴트 생성자가 존재하지 않음
		//Dialog d=new Dialog(); <ㅡ오류
	}

}
