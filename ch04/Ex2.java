package ch04;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//�Է��� ���ڰ� ������� �������� 0���� �Ǵ��ϼ���.
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int a=sc.nextInt();
		if (a>0) {
			System.out.println("����Դϴ�.");
		}
		else if(a<0) {
			System.out.println("�����Դϴ�.");
		}
		else if(a==0) {
			System.out.println("0�Դϴ�.");
		}
	}

}
