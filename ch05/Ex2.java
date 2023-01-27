package ch05;

public class Ex2 {

	public static void main(String[] args) {
		//다차원 배열:n차 개수만큼 for문이 존재한다.
		int arr[][]=new int[2][3];
		for(int i=0; i<arr.length; i++)//arr.length는 앞숫자 뜻함
		{
			for(int j=0; j<arr[i].length; j++)//arr[i].length는 뒷숫자뜻함
			{
				arr[i][j]=i+j;
				System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
			}
		}
	/*	//문제1. arr2모든 값 합구하기
		int arr2[][] = {
				{1,2},{3,4,5},{6},{1,2,3,4},{2,3,4}
		};
		int sum=0;
		
		for (int i=0; i<arr2.length; i++)
		{
			for (int j=0; j<arr2[i].length; j++)
			{
				sum=sum+arr2[i][j];
			}
		}
		System.out.println(sum);*/
		
		//문제2.arr3의 평균 구하기
		double total=0;
		int count=0;
		double arr3[][] = {
				{1.0},{2.3,3.4},{4.5,6.2,4.3},{9.0}
		};
		for (int i=0; i<arr3.length; i++)
		{
			for (int j=0; j<arr3[i].length; j++)
			{
				total=total+arr3[i][j];
				count++;
			}
		}
		total=total/count;
		System.out.println(total);
	}

}
