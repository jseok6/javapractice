package AWT;



import java.awt.Label;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import event.MFrame;


public class ListEx1 extends MFrame 
implements ItemListener {
	
	List list1, list2;
	Label label1, label2;
	
	String team1[] ={"롯데","삼성","한화","KIA","NC"};
	String team2[] ={"LG","두산","넥센","SK","KT"};
	
	public ListEx1() {
		list1=new List(3,false);//3개보이고 단일선택
		for (int i=0; i<team1.length; i++)
		{
			list1.add(team1[i]);
		}
		list2=new List(4,true);//4개보이고 다중선택
		for (int i=0; i<team2.length; i++)
		{
			list2.add(team2[i]);
		}
		add(list1);
		add(list2);
		add(label1=new Label("team1:                     "));
		add(label2=new Label("team1:                     "));
		list1.addItemListener(this);
		list2.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {//선택됫을때
		// TODO Auto-generated method stub
		String str1=list1.getSelectedItem();//단일선택
		label1.setText("team1:"+str1);
		str1="";
		String str2[]=list2.getSelectedItems();//복수선택받을때:items 쓰고 []붙이기
		for (int i=0; i<str2.length; i++)
		{
			str1+=str2[i]+" ";
		}
		label2.setText("team2:"+str1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListEx1();

	}

}
