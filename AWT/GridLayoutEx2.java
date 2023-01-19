package AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;

import event.MFrame;

public class GridLayoutEx2 extends MFrame{
	
	String s[] = {"add","remove","removeall","exit"};
	Button btn[]=new Button[4];
	
	public GridLayoutEx2() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		Panel p=new Panel();
		p.setLayout(new GridLayout(4,1));
		
		for (int i=0; i<btn.length; i++)
		{
			btn[i]=new Button(s[i]);
			p.add(btn[i]);
		}
		add(p,BorderLayout.EAST);
		validate();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx2();
	}

}
