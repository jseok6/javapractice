package ch06;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThisEx2 extends MFrame
implements ActionListener{
	Button btn;//버튼필요할때 사용
	
	public void actionPerformed(ActionEvent e) {
		//System.out.println("보이나요");
		MDialog md=new MDialog(this, "보이나요");
	}
	public ThisEx2() {
		super(500,500);
		btn=new Button("my Button");
		add(btn,"South");
		btn.addActionListener(this);
	}
	class MDialog extends Dialog
	implements ActionListener{
			Button mbtn;
			ThisEx2 f;
			public MDialog(ThisEx2 f, String title) {
				super(f, title, true);
				this.f=f;
				setLayout(new FlowLayout());
				setSize(150,100);
				mbtn=new Button("Click~~");
				mbtn.addActionListener(this);
				add(mbtn);
				setVisible(true);
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				f.btn.setBackground(Color.red);
				dispose();
			}
		}
	public static void main(String[] args) {
		new ThisEx2();
		
	}
	
}
