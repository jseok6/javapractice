package ch04;

public class Ex8 {

	public static void main(String[] args) {
		//문제1.1~30사이값중 3의배수합 
		//2. 1~30사이 값중 짝수와 홀수의 합 각각 구하기
		//3.1~50사이의 3,6,9의 합
		/*
		//문제1번
		int num=1,total=0;
		for (;num<31;num++) {
			if (num%3==0) {
				total+=num;
			}
		}
		System.out.println(total);
		*/
		
		/*문제 2번
		int num=1,even=0,odd=0;//even짝수합 odd 홀수합
		for (;num<31;num++) {
			if(num%2==0) {
				even+=num;
			}
			else {
				odd+=num;
			}
		}
		System.out.println("짝수합: "+even+" 홀수합: "+odd);
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
		System.out.println(" 3 6 9 숫자의 합:"+total);
		
		
		
		
	}

}




