package event;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx2 extends MFrame{
	
	Button move;
	
	public KeyEventEx2() {
		// TODO Auto-generated constructor stub
		super(400,500,new Color(100,200,100));
		setLayout(null);
		move=new Button("move");
		move.setBounds(200,250,50,30);
		move.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int code=e.getKeyCode();
				String txt=KeyEvent.getKeyText(code);
//				System.out.println(code+":"+txt);
				int x=move.getX();
				int y=move.getY();
				if(txt.equals("Right"))
				{
					if (x==340)
					{
						return;
					}
					x+=10;
					
				}
				else if(txt.equals("Left"))
				{
					if (x==10)
					{
						return;
					}
					x-=10;
				}
				else if(txt.equals("Up"))
				{
					if (y==30)
					{
						return;
					}
					y-=10;
				}
				else if(txt.equals("Down"))
				{
					if (y==460)
					{
						return;
					}
					y+=10;
				}
				move.setLocation(x,y);
				
			}
		
		});
		add(move);
		move.requestFocus();
		validate();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventEx2();
	}

}
