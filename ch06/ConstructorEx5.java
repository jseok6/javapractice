package ch06;

class Constructor5{
	int a;
	String str;
	
	
	public Constructor5() {
		/**
		 * �ߺ��ȱ��
		 * 
		 * */
	}
	public Constructor5(int i) {
		a=i;
		/**
		 * �ߺ��ȱ��
		 * */
	}
	public Constructor5(String s) {
		str=s;
		/**
		 * �ߺ��ȱ��
		 * */
	}
}

class Constructor5_1{
	int a;
	String str;
	public Constructor5_1() {
		/*
		 *�ߺ��ȱ�� */
	}
	public Constructor5_1(int i) {
		this();//�ڽ��� ����Ʈ ������ ȣ����,�ݵ�� �������� ù��°����
		//this�� ȣ���ϴ� �����ڴ� super ������ ����
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
