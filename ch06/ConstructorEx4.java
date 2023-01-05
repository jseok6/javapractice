package ch06;

class SuperClass4{//부모   SuperClass3의 부모는 Object
	//super라는 키워드 부모를 지칭하는것.
	//Super는 반드시 첫번째 라인에 와야됨
	
	
	public SuperClass4(int i) {
		super();
		System.out.println("Super 생성자");
	}
	
	
}
class SubClass4 extends SuperClass4{//자식
	public SubClass4() {
		super(22);//생략이 불가능함
		System.out.println("Sub 생성자");
		
	}
}
public class ConstructorEx4 {
 
	public static void main(String[] args) {

		SubClass4 s1= new SubClass4();
	}
 
}
 
//전체주석 컨트롤+shift+?
//주석 컨트롤+/ 