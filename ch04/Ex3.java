package ch04;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");//1����~20
		int a=sc.nextInt();
		int b=a%10;
		if (b%3==0) {
			System.out.println("¦");
		}
		System.out.println(a);
	}

}
