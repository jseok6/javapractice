package ch11;

import java.lang.*;

public class PalindromeEx1 {
	static final int MAX = 100000;
	public static void main(String[] args) {
		/*
		 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 합니다.
		 *   대칭수(palindrome)인 585는 2진수로 나타내도 1001001001가 되어 여전히 대칭수입니다.
        */
		
		//문제1.10진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		
//		int sum=0;
//		for (int i=0; i<MAX; i++)
//		{
//			int temp=0;
//			String str=String.valueOf(i);
//			for(int j=0; j<str.length()/2; j++) {
//				if(str.charAt(j)!=str.charAt(str.length()-1-j)) {
//					temp=1;
//					break;
//				}
//			}
//			if(temp==0) {
//				sum+=i;
//				
//			}
//			
//		}
//		System.out.println(sum);
		
		
		//문제2.2진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
//		int sum=0;
//		for(int i=0; i<MAX; i++) {
//			int temp=0;
//			String brs = Integer.toBinaryString(i);
//			for (int j=0; j<brs.length()/2; j++)
//			{
//				if(brs.charAt(j)!=brs.charAt(brs.length()-1-j)) 
//				{
//					temp=1;
//					break;
//				}
//			}
//			if (temp==0 ) 
//			{
//				sum+=Integer.parseInt(brs,2);
//			}
//		}
//		System.out.println(sum);
		
		//문제3.10진법과 2진법으로 모두 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		int sum=0;
		for (int i=0; i<MAX; i++)
		{
			int temp=0;
			String str=String.valueOf(i);
			for (int j=0; j<str.length()/2; j++)
			{
				if(str.charAt(j)!=str.charAt(str.length()-1-j))
				{
					temp=1;
					break;
				}
			}
			if (temp==0)
			{
				String brs=Integer.toBinaryString(i);
				for(int j=0; j<brs.length()/2; j++)
				{
					if(brs.charAt(j)!=brs.charAt(brs.length()-1-j))
					{
						temp=1;
						break;
					}
				}
				if (temp==0)
				{
					sum+=Integer.parseInt(brs,2);
				}
			}
		}
		System.out.println(sum);
	}
}
