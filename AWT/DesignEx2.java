package AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import event.MFrame;

public class DesignEx2 extends MFrame{

	TextField tf;
	TextArea ta;
	Button btn1, btn2;
	Panel p1, p2;
	
	public DesignEx2() {
		super(500,400);
		setTitle("디자인 예제2");
////		add(new Label("Hello Jun!"));
//		add(tf=new TextField("Hello JUN!",40));
//		add(ta=new TextArea(18,65));
//		ta.setEditable(false);
//		tf.addActionListener(this);
//		
//		
//		add(btn1=new Button("마우스시험용"));
//		btn1.setBounds(25, 170, 122, 40);
//		add(btn2=new Button("종료"));
//		btn1.setBounds(35, 170, 122, 40);
//		validate();
//	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		ta.append(tf.getText()+"\n");
//		tf.setText("");
//	}
		
		Panel p1,p2;
		tf=new TextField("Hello JUN!", 30);
		p1=new Panel();
		p1.add(tf);
		ta=new TextArea();
		p2=new Panel();
		p2.add(btn1=new Button("마우스 시험용"));
		p2.add(btn2=new Button("종료"));
		add(p1, BorderLayout.NORTH);
		add(ta);
		add(p2, BorderLayout.SOUTH);
		validate();
	}
	
	
	public static void main(String[] args) {
		new DesignEx2();
	}
}

