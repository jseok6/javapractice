package ch14;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		InputStream is=System.in;
//		InputStreamReader isr=new InputStreamReader(is);
//		BufferedReader br=new BufferedReader(isr);
//		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//위에 세줄이랑같음
		String s="";
		while(true)
		{
			try {
				s=br.readLine();
				System.out.println("출력:"+s);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
