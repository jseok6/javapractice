package ch04;

public class Ex11 {

	public static void main(String[] args) {
		//1~10������ ¦�� ���
		for(int i=1; i<11; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("\n-----------------");
		for(int i=1; i<11; i++)
		{
			if(i%2!=0)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("\n----------------------------");
		//1~20���� 3�ǹ���� �հ� �� ���.continue����ؼ�
		int sum=0;
		for(int i=1; i<21; i++)
		{
			if(i%3!=0)
			{
				continue;
			}
			sum=sum+i;
			System.out.print(i+"+");
		}
		System.out.println("="+sum);
	}

}
