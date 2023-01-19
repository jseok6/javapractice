package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx1 extends MFrame
implements ActionListener,KeyListener{
	
	
	TextField tf;
	TextArea ta;
	Button btn;
	public KeyEventEx1() {
		super(300,500);
		add(tf=new TextField(),BorderLayout.SOUTH);
		add(ta=new TextArea());
		ta.setEditable(false);
		btn = new Button("REMOVE");
		add(btn,BorderLayout.NORTH);
		btn.addActionListener(this);
		tf.addKeyListener(this);
		validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ta.setText("");
		tf.setText("");
		tf.requestFocus();
		
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		ta.append("##KeyTyped:"+tf.getText()+"\n");
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		ta.append("##KeyPressed:"+tf.getText()+"\n");
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		ta.append("##KeyReleased:"+tf.getText()+"\n");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventEx1();
	}

}
