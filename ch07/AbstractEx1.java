package ch07;

import java.awt.Component;

//추상클래스
abstract class Abstract1 {
	//추상메소드
	abstract void prn();
	
}

class Normal1 extends Abstract1{
	@Override
	void prn() {//<ㅡ 이거 꼭필요 안하면 문법에러남
	}
}

class MCompnent extends Component{
	
}

public class AbstractEx1 {

	public static void main(String[] args) {
		
		Abstract1 a;
		//a=new Abstract1(); 추상클래스 객체생성못함
		a= new Normal1();
		
	}

}
