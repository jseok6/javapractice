package ch10;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {//���ܰ� �Ͼ ���ɼ��� �ִ� �ڵ尡 ���� ����
			int a=10;
			int b=0;
			System.out.println("a+b= "+(a+b));
			System.out.println("a-b= "+(a-b));
			System.out.println("a*b= "+(a*b));
			System.out.println("a/b= "+(a/b));
		} catch (Exception e) {//���ܰ� �Ͼ�� ����Ǵ� ����
			System.err.println("0���� ������ �ȵǿ�");
		
			//System.err.println(e.getMessage());
		}
		System.out.println("����");
		
	}

}

