package ch14;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyEx2 extends MFrame 
implements ActionListener{
	
	Button open, save;
	TextArea ta;
	FileDialog openDialog, saveDialog;
	String sourceDir;
	String sourceFile;
	
	public FileCopyEx2() {
		super(400,500);
		setTitle("FileCopyEx2");
		add(ta = new TextArea());
		Panel p = new Panel();
		p.add(open = new Button("OPEN"));
		p.add(save = new Button("SAVE"));
		ta.setEditable(false);
		open.addActionListener(this);
		save.addActionListener(this);
		add(p,BorderLayout.SOUTH);
		validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==open) {
			openDialog=new FileDialog(this,"파일열기",FileDialog.LOAD);//파일열기창열기
			openDialog.setVisible(true);
			String dir,file;
			dir=openDialog.getDirectory();
			file=openDialog.getFile();
//			System.out.println(dir+":"+file);
			fileReader(dir+file);
		}else if(obj==save) {
			saveDialog=new FileDialog(this,"파일저장",FileDialog.SAVE);//파일열기창열기
			saveDialog.setVisible(true);
			String dir,file;
			dir=saveDialog.getDirectory();
			file=saveDialog.getFile();
			fileWriter(dir+file);
		}
	}
	

	public void fileReader(String file){
		try {
			FileReader fr=new FileReader(file);
			int a;
			String s="";
			while((a=fr.read())!=-1)
			{
				s+=(char)a;
			}
			ta.setText(s);
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

	public void fileWriter(String file){
		try {
			FileWriter fw=new FileWriter(file);
			fw.write(ta.getText());
			for (int i=5; i>0; i--)
			{
				ta.setText("저장하였습니다."+i+"초후에 사라집니다");
				Thread.sleep(1000);
			}
			ta.setText("");
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new FileCopyEx2();
	}
}










