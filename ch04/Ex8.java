package ch04;

public class Ex8 {

	public static void main(String[] args) {
		//����1.1~30���̰��� 3�ǹ���� 
		//2. 1~30���� ���� ¦���� Ȧ���� �� ���� ���ϱ�
		//3.1~50������ 3,6,9�� ��
		/*
		//����1��
		int num=1,total=0;
		for (;num<31;num++) {
			if (num%3==0) {
				total+=num;
			}
		}
		System.out.println(total);
		*/
		
		/*���� 2��
		int num=1,even=0,odd=0;//even¦���� odd Ȧ����
		for (;num<31;num++) {
			if(num%2==0) {
				even+=num;
			}
			else {
				odd+=num;
			}
		}
		System.out.println("¦����: "+even+" Ȧ����: "+odd);
		*/
		int num=1,total=0,n1,n2;
		for(;num<51;num++) {
			n2=num/10;
			n1=num%10;
			if(n2==3) {
				total+=num;
			}
			else if(n1%3==0&&n1!=0) {
				total+=num;
			}
		}
		System.out.println(" 3 6 9 ������ ��:"+total);
		
		
		
		
	}

}




