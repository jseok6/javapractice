package ch10;

import java.util.*;
public class ExceptionEx3 {

	public static void main(String[] args) {
		Scanner s=null;
		try {
			int a,b;
			s=new Scanner(System.in);
			System.out.print("ù��° ����:");
			a=s.nextInt();
			System.out.print("�ι�° ����:");
			b=s.nextInt();
			System.out.println(a+"/"+b+"="+(a/b));
		}
		
		catch (ArithmeticException e) {
			System.out.println("0���� �Է��ϸ� �ȵǿ�");
		}
		catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��ؾ� �մϴ�.");
		}
		catch (Exception e) {
			//�̰Ŵ� �Ǹ������� �־�ߵ� ������ ����Ƽ�
			//���� ĳġƿ���� ���� Exception�� ���� �;��Ѵ�.
		}
		finally {
			s.close();//����Ŀ� �ݵ�� �ݾƾ��Ѵ�.
		}

	}

}
