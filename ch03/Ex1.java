package ch03;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		int c=Math.max(a,b);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		//�Է��� ���� Ȧ������ ¦������ ����ϼ���.
		Scanner sc =new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int d = sc.nextInt();
		if (d%2==0) {
			System.out.println(d+"¦���Դϴ�.");
		}
		else {
			System.out.println(d+"Ȧ���Դϴ�.");
		}
	}

}
