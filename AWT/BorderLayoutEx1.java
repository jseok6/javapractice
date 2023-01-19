package AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.util.Random;

import event.MFrame;

public class BorderLayoutEx1 extends MFrame{
	String str[] = {"ù��°","�ι�°","����°","�׹�°","�ټ���°"};
	Button btn[]=new Button[5];
	
	public BorderLayoutEx1() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		for(int i=0; i<btn.length; i++) {
			btn[i]=new Button(str[i]);
			Color c[]=MColor.rColor2();
			btn[i].setBackground(c[0]);
			btn[i].setForeground(c[1]);
		}
		add(btn[0],"North");
		add(btn[1], BorderLayout.EAST);
		add(BorderLayout.SOUTH, btn[2]);
		add(BorderLayout.WEST, btn[3]);
		add(BorderLayout.CENTER, btn[4]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		for (int i=0; i<1000; i++)
		{
			BorderLayoutEx1 bl= new BorderLayoutEx1();
			int x=r.nextInt(2000);
			int y=r.nextInt(2000);
			bl.setBounds(x,y,200,200);


			
		}
		new BorderLayoutEx1();
		

	}

}
