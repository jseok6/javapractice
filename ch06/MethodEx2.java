package ch06;

class Method2{
	//�޼ҵ� �����ε�(over loading)
	//������ �޼ҵ������ �Ű������� ������ �ٸ��� ����.
	void prn(int a) {
		System.out.println(a);
		return;
	}
	void prn(int a,int b) {
		System.out.println(a+"\t"+b);
		
	}
	void prn(int a, int b, int c) {
		System.out.println(a+"\t"+b+"\t"+c);
	}
	void prn(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
	}
}


public class MethodEx2 {

	public static void main(String[] args) {
		//MathŬ������ abs�޼ҵ�� ���밪 ����
		int a=Math.abs(-10);
		double d= Math.abs(3.14);
		Method2 mt=new Method2();
		mt.prn(10);
		mt.prn(10,20);
		mt.prn(10,20,30);
	}

}
