package ch05;

public class Ex1 {

	public static void main(String[] args) {
		//1.�迭����
		int arr[];
		//2.�迭�� ũ������(�迭�� ũ��� �Һ�)
		arr=new int[5];
		//3.�迭�� �Ҵ�
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		//arr[5]=6;
		for (int i=0; i<arr.length; i++)
		{
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		
		int arr1[]=new int[3];
		for (int i=0; i<arr1.length; i++)
		{
			arr1[i]=i*10;
			System.out.println(arr1[i]);
		}
		//�迭����� ���ÿ� �ٷ� �Ҵ��ϱ�
		int arr2[]= {1,2,3,4,5,6};
		String str[]= {"Java","JSP","Android","Spring"};
		
	}

}
