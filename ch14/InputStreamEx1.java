package ch14;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
	InputStream is =System.in;//키보드에 연결된 빨대
	while(true)
	{
		try {
			int a=is.read();//내부적인 쓰레드:입력전에 대기상태가 되어있음
			if(a==-1/*ctrl+z*/) break;
			System.out.print((char)a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
