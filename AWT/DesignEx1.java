package AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;

import event.MFrame;

public class DesignEx1 extends MFrame {
	
	Label label;
	Checkbox cb1, cb2, cb3;
	CheckboxGroup cbg;
	Button btn1, btn2;
	
	public DesignEx1() {
		super(250,150);
		setTitle("������ ����1");
//		String str="                        ���� �߿� ����                        ";
//		label=new Label(str);
//		label.setBackground(Color.GREEN);
//		add(label);
//		cbg=new CheckboxGroup();
//		add(cb1=new Checkbox("���",cbg,true));
//		add(cb2=new Checkbox("����",cbg,true));
//		add(cb3=new Checkbox("�޵�",cbg,true));
//		btn1=new Button("Start");
//		btn2=new Button("End");
//		add(btn1);
//		add(btn2);
//		validate();
		Panel p1,p2;
		label=new Label("���� �߿� ����", Label.CENTER);
		label.setBackground(Color.GREEN);
		cbg=new CheckboxGroup();
		p1=new Panel();
		p1.add(cb1=new Checkbox("���",cbg,false));
		p1.add(cb1=new Checkbox("����",cbg,false));
		p1.add(cb1=new Checkbox("�޵�",cbg,false));
		add(label,BorderLayout.NORTH);
		p2=new Panel();
		p2.add(btn1=new Button("Start"));
		p2.add(btn2=new Button("End"));
		add(label,BorderLayout.NORTH);
		add(p1);
		add(p2,BorderLayout.SOUTH);
		validate();

	}	

	public static void main(String[] args) {
		new DesignEx1();
	}

}

