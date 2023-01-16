package ch11;

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java Programming";
		int len=str.length();
		System.out.println("len:"+len);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		String str2=str.substring(5);
		String str3=str.substring(5,10);
		System.out.println("str2:"+str2);
		System.out.println("str3:"+str3);
		
		//8번째 문자 리턴
		char c1=str.charAt(8);
		System.out.println("8번째문자:"+c1);
		//짝수자리 문자만 출력하시오.

		for (int i = 0; i < str.length(); i++) {
			if(i%2==0)
				System.out.print(str.charAt(i));
		}
		//a문자는 몇번째 자리에 있는가?
		//Java Programming
		int idx1=str.indexOf('a');
		System.out.println("\n"+"idx1:"+idx1);
		int idx2=str.lastIndexOf('a');
		System.out.println("\n"+"idx2:"+idx2);
		
		//a를 q로 변환출력하시오.:charAt
		String idx3=str.replace('a','q');
		System.out.println("\n"+"idx3:"+idx3);
		
		//charAt방법
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='a') {
				System.out.print('q');
			}
			else {
				System.out.print(str.charAt(i));
			}
		}//for
		System.out.println("----------------");
		//str을 반대로 출력하시오 
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		StringBuffer sb=new StringBuffer(str);
		System.out.println("\n"+sb.reverse());
		
		String str5="Java&JSP&Android&Iot&Spring";
		String str6[]=str5.split("&");//문자 &기준으로 나누기
		for (int i=0; i<str6.length; i++)
		{
			System.out.println(str6[i]);
		}
		
		String str7="          JSPStudy           ";//공백제거
		System.out.println("***"+str7.trim()+"***");
		
		int idx4=22;//정수를 문자로변환
		String str8=String.valueOf(idx4);
		String str9=idx4+"";
		System.out.println(str8+":"+str9);
		
		
		
	}

}
