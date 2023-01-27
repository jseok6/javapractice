package ch14;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileCopyEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("원본파일:");
			String sFILE=sc.nextLine();
			System.out.println("복사파일:");
			String cFILE=sc.nextLine();
			FileReader fr=new FileReader("ch14/"+sFILE);
			//파일생성
			FileWriter fw=new FileWriter("ch14/"+cFILE);
			
			int a;
			while((a=fr.read())!=-1)
			{
				fw.write(a);
				
			}
			fw.close();
			fr.close();
			System.out.println("Copy End!!");
			
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
