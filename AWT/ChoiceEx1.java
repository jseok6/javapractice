package AWT;

import java.awt.*;

import event.MFrame;

public class ChoiceEx1 extends MFrame {
	String city[] = {"���ø� �����ϼ���.","������","�� ��","�Ͽ���","�� ��","�� ��","�� ��"};
	Choice ch;
	
	public ChoiceEx1() {
		super(300,300, new Color(100,200,100));
		ch=new Choice();
		for (int i=0; i<city.length; i++)
		{
			ch.add(city[i]);
		}
		add(ch);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChoiceEx1();
	}

}
