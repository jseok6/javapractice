package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class RunnableFrameEx1 extends MFrame {
	
	Random r=new Random();
	int x,y;
	Color c;
	
	public RunnableFrameEx1(Color c) {
		// TODO Auto-generated constructor stub
		super(300,300);
		this.c=c;
	}
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<20; i++)
		{
			x=r.nextInt(300);//300���� ���ڷ���
			y=r.nextInt(300);
			try {
				Thread.sleep(500);
				repaint();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}

	}
	@Override
	public void paint(Graphics g) {
		g.setColor(c);
		g.fillOval(x, y, 10, 10);
	}
	
	@Override
	public void update(Graphics g) {//�׸� �����ϴ¹�
		// TODO Auto-generated method stub
		g.clipRect(x, y, 10, 10);
		paint(g);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableFrameEx1 r1=new RunnableFrameEx1(Color.PINK);//���Ͼ�����
		RunnableFrameEx1 r2=new RunnableFrameEx1(Color.GREEN);//���Ͼ����� ���� ���� �����
		r1.run();
		r2.run();

	}

}
