package ch11;

public class StringEx3 {

	public static void main(String[] args) {
		String str="전지현이가 백화점에서 팬사인회를 연다."
				 + "전지현은 5일 오후 3시 서울 소공동 롯데 백화점"
				 + " 8층 이벤트홀에서... 구두 브랜드 조이제화의" 
				 + " 홍보를 위한 팬사인회에 참석한다.";
		//1번 순방향으로 공백문자의 index번호 출력 5,11,....87 hint:indexof사용
		
		for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.print(i+" ");
            }
		}
		System.out.println("");
		/* 
		int idx=-1;
		do {
			idx=str.indexOf(' ',idx+1);
			if(idx>=0) {
				System.out.print(idx+",");
			}
			
		}while(idx>=0);
		*/
		//2번 역방향으로 공백문자의 index번호 출력
	
		for (int i = str.length()-1; i>=0; i--) {
            if (str.charAt(i) == ' ') {
                System.out.print(i+" ");
            }
		}
		
		/*
		int idx=str.length();
		do {
			idx=str.lastIndexOf(' ',idx-1);
			if(idx>=0) {
				System.out.print(idx+",");
			}
		}while(idx>=0);
		*/
		
		//3번 빈칸을'_'으로 출력하기 charAt
		String str1=str.replace(' ','_');
		System.out.println("\n"+str1);
		/*
		for(int i=0; i<str.length(); i++)
		{
			char c=str.charAt(i);
			if(c!=' ') {
				System.out.print(c);
			}
			else {
				System.out.print('_');
			}
		}
		*/
		
		
		//4번 첫단어 출력하기:substring,indexof
		
		
		
		int idx1=str.indexOf(' ');
		System.out.println(str.substring(0,idx1));
		//5번 마지막 단어 출력하기:substring,lastIndexOf
		
		
		int idx2=str.lastIndexOf(' ');
		System.out.println(str.substring(idx2+1,str.length()));
	}
}
