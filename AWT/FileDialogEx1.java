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
		openFile = new FileDialog(this, "���� ����", FileDialog.LOAD);
		openFile = new FileDialog(this, "���� ����", FileDialog.SAVE);
		Panel p=new Panel();
		p.add(openBtn= new Button("���� ����"));
		p.add(saveBtn= new Button("���� ����"));
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
