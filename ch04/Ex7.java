package ch04;

public class Ex7 {
	int a;

	public static void main(String[] args) {
		//for���� �̿��Ͽ� 1~10���� �� ���ϱ�
		int total=0;//������ �ѹ��� �ٲٴ¹�!! �巡���ؼ� �����ʸ��콺 ���ٴ� ���� refactor
		//������ rename
		for(int i=1,j=0;i<11; i++,j++) {
			total=total+i;
		}
		System.out.println("sum:"+total);
		int j=0;
		for (;j<11; j++) {
			System.out.println("j:"+j);
		}
		
		
	}
}
