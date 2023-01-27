package ch13;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("µÅÁö±¹¹ä");
		list.add("¼ø´ë±¹¹ä");
		list.add("¼¯¾î±¹¹ä");
		list.add(2,"¸Àº¸±â¼ø´ë");
		list.add(3,"³»Àå±¹¹ä");
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("-----------------");
		Iterator<String> e=list.iterator();
		while(e.hasNext())
		{
			System.out.println(e.next());
		}
		
	}

}
