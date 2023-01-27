package ch14;

import java.io.FileReader;

public class FileReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("ch14/aaa.txt");
			int a;
			while((a=fr.read())!=-1) {
				System.out.print((char)a);
				
			}
			fr.close();
			System.out.println("end");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
