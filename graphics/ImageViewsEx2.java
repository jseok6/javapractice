package graphics;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;



public class ImageViewsEx2 extends MFrame
implements ActionListener{
	
	
	Image img[]=new Image[3];
	Button btn[]=new Button[4];
	String str[]= {"첫번째", "두번째","세번째","랜덤"};
	Random r=new Random();
	int idx=0;
	
	
	public ImageViewsEx2() {
		// TODO Auto-generated constructor stub
		super(550,300);
		Panel p = new Panel();
		p.setLayout(new GridLayout(4,1));
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(str[i]);
			btn[i].addActionListener(this);
			p.add(btn[i]);
		}
		for(int i=0; i<img.length; i++)
		{
			img[i]=Toolkit.getDefaultToolkit().getImage("graphics/aaa"+i+".png");
		}
		add(p,BorderLayout.EAST);
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj=e.getSource();
		if(obj==btn[0])
		{
			idx=0;
		}
		else if(obj==btn[1])
		{
			idx=1;
		}
		else if(obj==btn[2])
		{
			idx=2;
		}
		else if(obj==btn[3])
		{
			idx=r.nextInt(3);
		}
		repaint();
		
		
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		setTitle("graphics/aaa"+idx+".png");
		g.drawImage(img[idx],0,0,this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageViewsEx2();

	}

}
