package ch14;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is=System.in;
		
		
		//1byte단위로 들어온 data를 문자 단위로 변환
		Reader reader=new InputStreamReader(is);
		while(true)
		{
			try {
				int a=reader.read();//내부적인 쓰레드:입력전에 대기상태가 되어있음
				if(a==-1/*ctrl+z*/) break;
				System.out.print((char)a);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("end");

	}

}
