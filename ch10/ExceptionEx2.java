package ch10;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			int arr[]=new int[3];
			arr[0]=10;
			arr[1]=10;
			arr[2]=10;
			arr[3]=10;
			System.out.println("����ǳ���?");
		} 
		catch (Exception e) {
			System.out.println("�迭 �����Դϴ�.");
		}
		finally {//���ܿ� ������� ������ ����
			System.out.println("finally~");
		}

	}

}