package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventEx3 extends MFrame{
	
	
	Button btn;
	public MouseEventEx3() {
		// TODO Auto-generated constructor stub
		add(btn=new Button("��ư"), BorderLayout.SOUTH);
		btn.addMouseListener(new MyMouseAdapter());
		
		
	}
	class MyMouseAdapter extends MouseAdapter{
		//Adapter:�ʿ��� �޼ҵ常 �������̵� �ϸ� �Ǵ� ���
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			setBackground(MColor.rColor());
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			setBackground(MColor.rColor());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventEx3();
	}

}
