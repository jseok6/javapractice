package AWT;

import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import event.MFrame;

public class TextEx1 extends MFrame 
implements ActionListener {
	
	TextField tf1,tf2;
	TextArea ta;
	
	
	
	public TextEx1() {
		super(250,300);
		add(new Label("성명"));
		add(tf1=new TextField("홍길동", 20));
		add(new Label("비번"));
		add(tf2=new TextField("", 20));
		tf2.setEchoChar('@');// ' '안에든 문자로 친것을 바꾸게만듬
		add(ta=new TextArea(10,30));
		ta.setEditable(false);
		tf2.addActionListener(this);
		validate();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ta.append(tf1.getText()+"/"+tf2.getText()+"\n");//ta에 tf1텍스트와 tf2텍스트 받아와서 추가하고 뛰운다
		tf1.setText("");//리셋
		tf2.setText("");//리셋
		tf1.requestFocus();//다시 tf1로 커서 깜박하게 함
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextEx1();
	}

}
