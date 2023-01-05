package ch06;

class Constructor5{
	int a;
	String str;
	
	
	public Constructor5() {
		/**
		 * 중복된기능
		 * 
		 * */
	}
	public Constructor5(int i) {
		a=i;
		/**
		 * 중복된기능
		 * */
	}
	public Constructor5(String s) {
		str=s;
		/**
		 * 중복된기능
		 * */
	}
}

class Constructor5_1{
	int a;
	String str;
	public Constructor5_1() {
		/*
		 *중복된기능 */
	}
	public Constructor5_1(int i) {
		this();//자신의 디폴트 생성자 호출함,반드시 생성자의 첫번째라인
		//this를 호출하는 생성자는 super 무조건 생략
		a=i;
	}
	public Constructor5_1(String s) {
		this();
		str=s;
	}
}

public class ConstructorEx5 {

	public static void main(String[] args) {
		
		
		
	}

}
