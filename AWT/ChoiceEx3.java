package AWT;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import event.MFrame;

public class ChoiceEx3 extends MFrame 
implements ItemListener{

	
	Choice name,star;
	String ms[] = {"�� ��","�� ��","�̹�ȣ","�����","����","������"};
	String fs[] = {"��ƶ�","�̿���","���ϴ�","��ä��","�� ��","�迬��"};
	public ChoiceEx3() {
		
		name=new Choice();
		star=new Choice();
		name.add("���ڿ�����");
		name.add("���ڿ�����");
//		for(int i=0; i<ms.length; i++)
//		{
//			star.add(ms[i]);
//		}
		inputItem(star,ms);
		add(name);
		add(star); 
		name.addItemListener(this);
		star.addItemListener(this);
		add(new Label("�����ΰ� �̸��� �����ϼ���."));
		
	}
	public void inputItem(Choice c, String item[]) {
		c.removeAll();
		for (int i=0; i<item.length; i++)
		{
			c.add(item[i]);
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {//���õ�����
		// TODO Auto-generated method stub
		if(name.getSelectedItem().equals("���ڿ�����")) {//���ϼ��� ���밡������
			inputItem(star,ms);
		}
		else if(name.getSelectedItem().equals("���ڿ�����")) {
			inputItem(star,fs);
		}
		
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChoiceEx3();
	}

}
