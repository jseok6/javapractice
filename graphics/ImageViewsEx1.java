package graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class ImageViewsEx1 extends MFrame{
	
	
	Image img;
	public ImageViewsEx1() {
		
		// TODO Auto-generated constructor stub
		super(500,300);
		img=Toolkit.getDefaultToolkit().getImage("graphics/aaa.jpg");
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(img,0,0,this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageViewsEx1();
	}

}
