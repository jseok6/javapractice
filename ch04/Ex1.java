package ch04;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * ���:����(����)��,�ݺ���
		 * -���ǹ�:if-else,switch
		 * -�ݺ���:for,while
		 */
		Scanner sc =new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int a=sc.nextInt();
		System.out.println("�Է��� ����:"+a);
		if (a%3==0) {
			System.out.println("3�ǹ���Դϴ�.");
		}
		else {
			System.out.println("3�ǹ���� �ƴմϴ�.");
		}
	}

}
