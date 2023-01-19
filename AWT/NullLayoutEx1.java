package AWT;

import java.awt.Button;

import event.MFrame;

public class NullLayoutEx1 extends MFrame{
	Button btn1, btn2;
	public NullLayoutEx1() {
		// TODO Auto-generated constructor stub
		setLayout(null);
		btn1=new Button("버튼1");
		btn2=new Button("버튼2");
		btn1.setBounds(10, 50, 50, 50);
		btn2.setBounds(100, 50, 50, 50);
		add(btn1);
		add(btn2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullLayoutEx1();

	}

}
