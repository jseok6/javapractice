package ch04;
import java.util.Random;
import java.util.Arrays;

public class LottoLucky {

	public static void main(String[] args) {
		int lotto[]=getLotto();
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+"\t");
		}
	}
	
	public static int[] getLotto() {
		int lotto[]=new int[6];
		//배열 밑에 항상 for문 있다.
		//중복로직 추가
		Random r=new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1;//1~45
			for (int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lotto);//오름차순정렬
		return lotto;
	}						
}
