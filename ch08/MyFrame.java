package ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch07.MFrame;

public class MyFrame extends MFrame implements ActionListener{

	Button btn;
	boolean flag=false;
	public MyFrame() {
		btn=new Button("Button");
		add(btn,BorderLayout.SOUTH);//��ư�Ʒ���
		//add(btn,"South");
		setBackground(Color.ORANGE);//����
		
		//�� �ڽ��� ActionListenerŸ���̹Ƿ� this�� ����
		//��ư�� Ŭ���� �ϸ� ActionEvent ��ü�� ���������� ������
		btn.addActionListener(this);//actionperformed ���� �޼ҵ���
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(flag)
		{
			setBackground(Color.ORANGE);
		}
		else
		{
			setBackground(Color.PINK);
		}
		flag=!flag;
	}
	
	public static void main(String[] args) {
		
		new MyFrame();
	}

}
