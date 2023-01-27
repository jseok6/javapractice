package ch09;
//종료버튼
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ch07.MFrame;



public class MyFrame extends MFrame{

	Button btn;
	
	public MyFrame() {
		add(btn=new Button("Exit"), BorderLayout.SOUTH);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);//종료
			}
		});
		
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}

