package ch06;
/*static �ʵ� �� �޼ҵ�� Ŭ������.�ʵ� or �޼ҵ� �϶�
 * �޸� �ε��� ������ non-static �ʵ� �� �޼ҵ��
 * �ݵ�� ��ü�� �����ؾ� �޸� �ε��ȴ�.
 * �׷��� non-static �ʵ� �� �޼ҵ�� static �ʵ� �� �޼ҵ忡
 * ��� �� �� ����.
 * */
class Static2{
	static int a=10;
	
	
	int b=10;//non-static
	
	static void prn1() {
		System.out.println(a);
		//System.out.println(b);//static�޼ҵ�� non=static ���Ұ�
	}
	void prn2() {
		System.out.println(a);
		System.out.println(b);
	}
	
}
public class StaticEx2 {
	public static void main(String[] args) {
		Static2 st=new Static2();
		st.prn1();
	}
}