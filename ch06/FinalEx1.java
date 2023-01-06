package ch06;
/*final(마지막):클래스,필드(인스턴스변수),메소드
 * 1.클래스:sub클래스가 없는 클래스
 * 2.필드:상수선언(필드,매개변수,지역변수)
 * 3.메소드:오버라이딩불가
 * 오버라이딩이란:상위클래스에서 정의한 메소드를 하위클래스에서 재정의하는것
 * */

final class Final1{
	
}

class Final3{
	static final int KIA=1;//상수는 무조건 static을 붙인다
	final int SK=2;//final은 상수인데 초기화를 무조건 해줘야함.
	int k;
	public Final3() {
		//KIA=2; <ㅡkia final로 선언했기 때문에 오류
		System.out.println(k);
	}
	public void prn(final int a)
	{
		//a=10;
		final int b=10;
		//b=20; 지역변수 선언했는데 final로 앞에 선언되었기 때문에 변경불가
		int c;
		//System.out.println(c); 오류
		int d=10;
		int e;
		e=10;
	}
}


class Final4{
	void prn1() {
		
	}
	final void prn2() {
		
	}
}
class Final5 extends Final4{
	@Override
	void prn1() {
		
	}
	
}
//class Final extends Final1{} 상속불가능
public class FinalEx1 {

	public static void main(String[] args) {
		
	}

}
