package AWT;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import event.MFrame;

public class FileDialogEx1 extends MFrame
implements ActionListener{
	
	FileDialog openFile,saveFile;
	Button openBtn,saveBtn;
	
	public FileDialogEx1() {
		openFile = new FileDialog(this, "파일 열기", FileDialog.LOAD);
		openFile = new FileDialog(this, "파일 저장", FileDialog.SAVE);
		Panel p=new Panel();
		p.add(openBtn= new Button("파일 열기"));
		p.add(saveBtn= new Button("파일 저장"));
		add(p);
		openBtn.addActionListener(this);
		saveBtn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==openBtn)
		{
			openFile.setVisible(true);
		}
		else if(e.getSource()==saveBtn)
		{
			saveFile.setVisible(true);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileDialogEx1();

	}

}
