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
		add(btn,BorderLayout.SOUTH);//��ư�Ʒ���
		//add(btn,"South");
		setBackground(Color.GREEN);//����
		//MyAction ma=new MyAction();
		//btn.addActionListener(ma);
		//�� �ڽ��� ActionListenerŸ���̹Ƿ� this�� ����
		//��ư�� Ŭ���� �ϸ� ActionEvent ��ü�� ���������� ������
		btn.addActionListener(this);//actionperformed ���� �޼ҵ���
		
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