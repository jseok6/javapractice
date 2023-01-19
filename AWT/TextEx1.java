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
		add(new Label("����"));
		add(tf1=new TextField("ȫ�浿", 20));
		add(new Label("���"));
		add(tf2=new TextField("", 20));
		tf2.setEchoChar('@');// ' '�ȿ��� ���ڷ� ģ���� �ٲٰԸ���
		add(ta=new TextArea(10,30));
		ta.setEditable(false);
		tf2.addActionListener(this);
		validate();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ta.append(tf1.getText()+"/"+tf2.getText()+"\n");//ta�� tf1�ؽ�Ʈ�� tf2�ؽ�Ʈ �޾ƿͼ� �߰��ϰ� �ٿ��
		tf1.setText("");//����
		tf2.setText("");//����
		tf1.requestFocus();//�ٽ� tf1�� Ŀ�� �����ϰ� ��
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextEx1();
	}

}
