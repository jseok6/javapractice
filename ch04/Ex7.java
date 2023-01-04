package ch04;

public class Ex7 {
	int a;

	public static void main(String[] args) {
		//for문을 이용하여 1~10까지 합 구하기
		int total=0;//변수명 한번에 바꾸는법!! 드래그해서 오른쪽마우스 갖다댄 다음 refactor
		//다음에 rename
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
