package ch04;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		/*������ �г� �Է¹޾� 60���̻��̸� �հ�
		4�г��� 70���̻��հ�*/
		Scanner sc=new Scanner(System.in);
		int score,year;
		System.out.println("������ �Է��ϼ���.(0~100)");
		score=sc.nextInt();
		System.out.println("�г��� �Է��ϼ���.(1~4)");
		year=sc.nextInt();
		if (year<4)
		{
			if(score>=60) 
			{
				System.out.println("�հ�");
			}
			else 
			{
				System.out.println("���հ�");
			}
		}
		else if(year==4)
		{
			if(score>=70)
			{
				System.out.println("�հ�");
			}
			else 
			{
				System.out.println("���հ�");
			}
		}
	}

}
