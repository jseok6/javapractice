package ch14;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i='A';
		char c='b';
		char c1='��';
		try {
			OutputStream os=System.out;
			Writer writer=new OutputStreamWriter(os);
			writer.write(i);
			writer.write(c);
			writer.write(c1);
			writer.flush();
			os.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
