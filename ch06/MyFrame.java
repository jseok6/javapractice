package ch06;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends MFrame {
	//500x500,??????:white,resize:false
	Random r;
	public MyFrame() {
		super(500,500,Color.WHITE,false);
		r=new Random();//??????ü
	}
	
	
	public void paint(Graphics g)
	{
		
		for (int i=0; i<10000; i++) {
		g.setColor(rColor());//?׿? ????????
		int x=r.nextInt(500);
		int y=r.nextInt(500);
		int w=r.nextInt(10)+5;
		int h=r.nextInt(10)+5;
	
		
		//g.drawString("?ݰ????ϴ?.", 50,50);
		//g.drawRect(x, y, w, h);
		g.fillRect(x, y, w, h);
		try {
			Thread.sleep(50);
		} 
		catch (InterruptedException e) {
		}
		}//for
	}//paint
	public  Color rColor(){
		int rr,gg,bb;
		rr = r.nextInt(256);
		gg = r.nextInt(256);
		bb = r.nextInt(256);
		return new Color(rr,gg,bb);
	}
	
	
	public static void main(String[] args) {
//		Frame f= new Frame();
//		f.setSize(300,300);
//		f.setVisible(true);
//		MFrame m= new MFrame();
		new MyFrame();
		
		
	}

}
