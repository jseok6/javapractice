package ch04;

public class Ex9 {

	public static void main(String[] args) {
		//while�� �̿��Ͽ� 1~10���� �ձ��ϱ�
		int sum=0;
		int i=1;
		while(i<11) {
			sum+=i;
			i++;
		}
		System.out.println("sum:"+sum);
		/*
		while(ture) {
			System.out.println("while�� ����");
			if(ture) {
				break;//�ݺ�����������
			}
		}
		*/
	}

}
