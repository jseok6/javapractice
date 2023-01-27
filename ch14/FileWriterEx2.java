package ch14;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class FileWriterEx2 extends MFrame 
implements ActionListener{
	TextArea ta;
	TextField tf;
	Button save;
	
	public FileWriterEx2() {
		// TODO Auto-generated constructor stub
		super(300,400);
		setTitle("FileWriterEx1");
		add(ta=new TextArea());
		Panel p = new Panel();
		p.add(tf = new TextField(25));
		p.add(save = new Button("SAVE"));
		ta.setEditable(false);
		tf.addActionListener(this);
		save.addActionListener(this);
		add(p,BorderLayout.SOUTH);
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj=e.getSource();
		if(obj==tf)
		{
			ta.append(tf.getText()+"\n");
			tf.setText("");
			tf.requestFocus();
			
		}
		else if(obj==save)
		{
//			ta.setText("�����Ͽ����ϴ� 5�ʵ� ������ϴ�.");
			saveFile(ta.getText());
			ta.setText("");
			try {
				for (int i = 5; i > 0; i--) {
					ta.setText("���� �Ͽ����ϴ�. - "+ i
							+"���Ŀ� ������ϴ�.");
					Thread.sleep(1000);
				}
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			ta.setText("");
		}
		
	}
	public void saveFile(String intxt) {
		try {
			long fName=System.currentTimeMillis();
			FileWriter fw=new FileWriter("ch14/"+fName+".txt");
			fw.write(intxt);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new FileWriterEx2();
	}
}
