package ch09;
/*내부(중첩클래스)
 * 1.클래스 안에 선언(대부분)
 * 2.클래스안에 선언이지만 static 클래스 선언(활용도는 거의 없음)
 * 3.메소드 안에 클래스 선언(활용도 높지않음)
 * 4.익명클래스(메소드안에 선언을 하고 선언과 동시 생성) (활용도 대부분)
 * 1번4번 주로 사용
 * 
 * */
interface MyInter{
	void prn();
}


class Outer1{
	class Inner1{
		
	}
	static class Inner2{
		
	}
	//메소드 안에 메소드는 선언 불가능
	//메소드 안에 클래스는 선언은 가능함
	void prn() {
		class Inner3{
			
		}
		new MyInter() {
			@Override
			public void prn() {
				
			}
		};
		 
	}
}


public class InnerEx1 {

	public static void main(String[] args) {

	}

}

