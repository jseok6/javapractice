package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EventEx1 extends MFrame
implements ActionListener{//이벤트 리스너

//1 이벤트 소스생성	
	Button btn;
	public EventEx1() {
		// TODO Auto-generated constructor stub
		add(btn=new Button("버튼"),BorderLayout.SOUTH);
		//4.이벤트 소스랑 이벤트 핸들러 연결(addXxxListener)
		btn.addActionListener(this);
		validate();

	}
	//3.이벤트 리스너의 메소드(이벤트핸들러) 구현
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
