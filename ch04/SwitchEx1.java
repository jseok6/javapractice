package ch04;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Month�� �Է��ϼ���.");
		int m=sc.nextInt();
		if(m==12||m==1||m==2) {
			System.out.println("�ܿ��Դϴ�.");
		}
		else if(m==3||m==4||m==5) {
			System.out.println("���Դϴ�.");
		}
		else if(m==6||m==7||m==8) {
			System.out.println("�����Դϴ�.");
		}
		else if(m==9||m==10||m==11) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("�ش�Ǵ� ������ �����ϴ�.");
		}
		
		////////////////////
		switch(m) {
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("�ش�Ǵ� ������ �����ϴ�.");
		}
	}

}
