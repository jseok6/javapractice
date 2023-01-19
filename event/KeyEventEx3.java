package event;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx3 extends MFrame
implements KeyListener{
	
	Button move;
	
	public KeyEventEx3() {
		// TODO Auto-generated constructor stub
		super(500,300,new Color(100,200,100));
		this.addKeyListener(this);
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		Graphics g=getGraphics();
		g.setFont(new Font("Dialog", Font.BOLD,20));
		///출력된 글씨 지우기
		g.setColor(Color.white);
		g.clearRect(0, 0, getWidth(), getHeight());
		///////////////
		g.setColor(Color.red);
		g.drawString("code값:"+e.getKeyCode(),30,80);
		g.drawString("문자값:"+e.getKeyChar(),30,110);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		Graphics g=getGraphics();
		g.setFont(new Font("Dialog", Font.BOLD,20));
		g.setColor(Color.BLUE);
		g.drawString("code값:"+e.getKeyCode(),30,150);
		g.drawString("문자값:"+e.getKeyChar(),30,180);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventEx3();
	}

}
