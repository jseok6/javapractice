package ch04;

public class Ex9 {

	public static void main(String[] args) {
		//while문 이용하여 1~10까지 합구하기
		int sum=0;
		int i=1;
		while(i<11) {
			sum+=i;
			i++;
		}
		System.out.println("sum:"+sum);
		/*
		while(ture) {
			System.out.println("while문 실행");
			if(ture) {
				break;//반복문빠져나감
			}
		}
		*/
	}

}
