package ch05;

public class Ex1 {

	public static void main(String[] args) {
		//1.배열선언
		int arr[];
		//2.배열의 크기지정(배열의 크기는 불변)
		arr=new int[5];
		//3.배열값 할당
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
		//배열선언과 동시에 바로 할당하기
		int arr2[]= {1,2,3,4,5,6};
		String str[]= {"Java","JSP","Android","Spring"};
		
	}

}
