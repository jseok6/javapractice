package ch14;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is=System.in;
		
		
		//1byte������ ���� data�� ���� ������ ��ȯ
		Reader reader=new InputStreamReader(is);
		while(true)
		{
			try {
				int a=reader.read();//�������� ������:�Է����� �����°� �Ǿ�����
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
