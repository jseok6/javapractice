package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DialogEx1 extends MFrame
implements ActionListener{
	
	Button btn;
	String title="�޼��� ��ȭ����";
	
	public DialogEx1() {
		super(300,300);
		setLayout(new BorderLayout());
		add(btn=new Button("���̱�"), BorderLayout.SOUTH);
		setResizable(true);
		btn.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		System.out.println(getWidth());
//		System.out.println(getHeight());
//		System.out.println(getX());
//		System.out.println(getY());
		MyDialog md= new MyDialog(this,title,true);
		int x=getX();
		int y=getY();
		int width=100;
		int height=150;
		md.setBounds(x, y, width, height);
		md.setVisible(true);
		
	}
	//���� Ŭ���������Ұ���:�ܺ� Ŭ������ ���� ������ ���谡 �ִ�Ŭ����
	class MyDialog extends Dialog implements ActionListener{
		
		Button b;
		
		public MyDialog(Frame owner, String title, boolean modal) {
			super(owner, title, modal);
			setLayout(new FlowLayout());
			b=new Button("Ȯ��");
			b.addActionListener(this);
			add(b);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DialogEx1();

	}

}
