package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EventEx1 extends MFrame
implements ActionListener{//�̺�Ʈ ������

//1 �̺�Ʈ �ҽ�����	
	Button btn;
	public EventEx1() {
		// TODO Auto-generated constructor stub
		add(btn=new Button("��ư"),BorderLayout.SOUTH);
		//4.�̺�Ʈ �ҽ��� �̺�Ʈ �ڵ鷯 ����(addXxxListener)
		btn.addActionListener(this);
		validate();

	}
	//3.�̺�Ʈ �������� �޼ҵ�(�̺�Ʈ�ڵ鷯) ����
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setBackground(MColor.rColor());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventEx1();
	}

}
