package AWT;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;

import event.MFrame;

public class GridLayoutEx1 extends MFrame{
	
	public GridLayoutEx1() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(3,2));
		add(new Button("1"));
		add(new Button("2"));
		add(new Label("하하"));
		add(new Button("3"));
		add(new Button("4"));
		add(new Label("호호"));
		validate();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx1();

	}

}
