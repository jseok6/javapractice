package ch04;

public class Ex10 {

	public static void main(String[] args) {
		/*
		int a=0;
		while(true) {
			if(a==10) {
				break;
			}
			System.out.println("a: "+a);
			a++;
		}//while
		*/
		
		//for문 이용하여 순차적으로 1에서n까지 합이 100에서 최대한 가까운 합 리턴
		/*
		int sum=0;
		for(int i=1;true; i++) {
			if(sum>100) {
				break;
			}
			System.out.print(i+"\t");
			sum+=i;
		}
		System.out.println("sum:"+sum);
		
		for(int i=0;i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(i+"+"+j+"="+(i+j));
			}
			System.out.println();
		}
		*/
		
		/*
		iot:
		for (int i=0; i<5; i++)
		{
			for(int j=0; j<10; j++)
			{
				
				if(i+j>10)
				{
					break iot;//<ㅡfor문 전체 빠져나감 iot쪽으로
				}
			}
		}
		*/
		
		//문제:중첩for문 이용하여 i,j합 30넘어가면 빠져나오기
		iot2:
		for(int i=0;true;i++)
		{
			for(int j=0;true;j++)
			{
				System.out.println(i+j);
				
				if(i+j>30)
				{
					break iot2;
				}
			}
		}
		
		
	}

}
