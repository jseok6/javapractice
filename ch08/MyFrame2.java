package ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch07.MFrame;

public class MyFrame2 extends MFrame implements ActionListener{

	Button btn;
	boolean flag=false;
	public MyFrame2() {
		btn=new Button("Button2");
		add(btn,BorderLayout.SOUTH);//버튼아래로
		//add(btn,"South");
		setBackground(Color.GREEN);//배경색
		//MyAction ma=new MyAction();
		//btn.addActionListener(ma);
		//내 자신이 ActionListener타입이므로 this가 가능
		//버튼을 클릭을 하면 ActionEvent 객체가 내부적으로 생성됨
		btn.addActionListener(this);//actionperformed 연결 메소드임
		
	}
//class MyAction implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		if(flag)
		{
			setBackground(Color.GREEN);
		}
		else
		{
			setBackground(Color.YELLOW);
		}
		flag=!flag;
	}
//}

	public static void main(String[] args) {
		
		new MyFrame2();
	}

}