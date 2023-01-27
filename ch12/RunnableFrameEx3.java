//package ch12;
//
//import java.awt.Color;
//import java.awt.Graphics;
//import java.util.Random;
//
//public class RunnableFrameEx3 extends MFrame 
//implements Runnable{
//	
//	Random r=new Random();
//	Random ge=new Random();
//	int x,y;
//	Color c;
//	int fpem=ge.nextInt(256);
//	int rmfls=ge.nextInt(256);
//	int qmffn=ge.nextInt(256);
//	int[] arr1=new int[9];
//	int[] arr2=new int[9];
//	
//	public RunnableFrameEx3() {
//		// TODO Auto-generated constructor stub
//		super(200,200);
//		this.c=c;
//		
//	}
//	public void run() {
//		// TODO Auto-generated method stub
//		for(int i=0; i<20; i++)
//		{
//			x=r.nextInt(200);//300안의 숫자랜덤
//			y=r.nextInt(200);
//			try {
//				Thread.sleep(500);
//				repaint();
//			} catch (InterruptedException e) {
//				// TODO: handle exception
//			}
//			
//		}
//
//	}
//	@Override
//	public void paint(Graphics g) {
//		g.setColor(new Color(fpem,qmffn,rmfls));
//		g.fillOval(x, y, 10, 10);
//	}
//	
//	@Override
//	public void update(Graphics g) {//그림 유지하는법
//		// TODO Auto-generated method stub
//		g.clipRect(x, y, 10, 10);
//		paint(g);
//	}
//	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		RunnableFrameEx3 ra[]=new RunnableFrameEx3[9];
//		for (int i=0; i<ra.length; i++)
//		{
//			int x1=200+(200*(i%3));
//			int y1=200+(200*(i/3));
//			ra[i]=new RunnableFrameEx3(x1,y1);
//			new Thread(ra[i]).start();
//		}
//
//	}
//
//}
