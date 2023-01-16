package ch06;

public class StaticEx1 {

	/*static 필드 및 메소드는 객체를 생성하지 않아도 사용가능
	 * 생성시점:클래스이름으로 접근하기 때문에 그때 메모리에 로딩.
	 * */
	/*static 필드 및 메소드는 클래스명.필드 or 메소드 일때
	 * 메모리 로딩이 되지만 non-static 필드 및 메소드는
	 * 반드시 객체를 생성해야 메모리 로딩된다.
	 * 그래서 non-static 필드 및 메소드는 static 필드 및 메소드에
	 * 사용 할 수 없다.
	 * */
class Static1{
	/*static*/ int i=0;
	int j=0;
	
	/*static*/ void prn() {
		
	}
	void prn2() {
		
	}
	/*static*/ class inner{}//내부 클래스 앞에는 static 올 수 있음.
}

	public static void main(String[] args) {
		int a=Math.abs(-6);
		int b=(int)Math.round(3.14);
		Integer i= new Integer(22);
		int c=i.parseInt("23");
		int d=Integer.parseInt("23");
		//반지름이 5인 원의 넓이를 구하시오
		System.out.println(5*5*Math.PI);
		System.out.println();
	}

}
