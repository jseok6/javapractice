package AWT;
import java.awt.Label;

import event.MFrame;


public class LabelEx1 extends MFrame{
	
	//Label label1,label2,label3,label4;//����
	Label label[]=new Label[4];
	int pos[]= {Label.LEFT,Label.CENTER,Label.RIGHT,Label.LEFT};
	
	
	public LabelEx1(){
		
		super(200,200);
		setTitle("Label Example");
		String str="������ ��ſ� ������";
//		label1=new Label(str);
//		label2=new Label(str, Label.CENTER);
//		label3=new Label(str, Label.RIGHT);
//		label4=new Label(str, Label.LEFT);
//		label1.setBackground(MColor.rColor());
//		label2.setBackground(MColor.rColor());
//		label3.setBackground(MColor.rColor());
//		label4.setBackground(MColor.rColor());
//		add(label1);
//		add(label2);
//		add(label3);
//		add(label4);
		
		for (int i=0; i<label.length; i++)
		{
			label[i]=new Label(str, pos[i]);
			label[i].setBackground(MColor.rColor());
			add(label[i]);
		}
		validate();//�̰� ���� 4���� ����
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx1();
	}

}
