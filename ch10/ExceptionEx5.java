package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionEx5 {

	public static void main(String[] args) {
		try {
			FileReader fr=myRead("name.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static FileReader myRead(String name) 
			throws FileNotFoundException {
		
		FileReader fr=new FileReader(name);
		return fr;
		
	}

}
