package ch06;

class SuperClass3{//부모   SuperClass3의 부모는 Object
	public SuperClass3() {
		super();
		System.out.println("Super 생성자");
	}
	
	
}
class SubClass3 extends SuperClass3{//자식
	public SubClass3() {
		super();//생략:반드시 생성자의 첫번째 라인에 와야됨.
		System.out.println("Sub 생성자");
		
	}
}


public class ConstructorEx3 {

	public static void main(String[] args) {
		SubClass3 s1= new SubClass3();
		
	}

}
//자바의 객체생성은 부모객체부터 먼저 생성된다
//그러므로 부모생성자부터 먼저 실행되고 자식생성자는 마지막에 실행됨
//Obj->Super->Sub