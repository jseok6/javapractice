package AWT;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import event.MFrame;

public class ChoiceEx2 extends MFrame 
implements ItemListener{
	String sair[] = {"�����װ�","�ƽþƳ�","����λ�","������"};
	String scity[] = {"�� ��","�� ��","�� ��","�� ��","���ֵ�"};
	Choice air,city;
	
	public ChoiceEx2() {
		super(300,300, new Color(100,200,100));
		air=new Choice();
		city=new Choice();
		for (int i=0; i<sair.length; i++)
		{
			air.add(sair[i]);
		}
		for (int i=0; i<scity.length; i++)
		{
			city.add(scity[i]);
		}
		add(air);
		add(city);
		air.addItemListener(this);
		city.addItemListener(this);
		add(new Label("�װ���� ���ø� �����ϼ���"));
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ȣ��");
		repaint();//��������� paintȣ�� <���̰��ϸ� �װ��� ���� �Ҷ����� ���� ���ŵ�
	}
	@Override
	public void paint(Graphics g/*��*/) {
		// TODO Auto-generated method stub
		if (air==null||city ==null)
		{
			return;//�޼ҵ� �߰� ������ ���Ŀ� �ڵ��� ����ȭ
		}
		g.setColor(Color.BLUE);
		String str="�װ��� ����:"+air.getSelectedItem();
		g.drawString(str, 30, 120);
		g.setColor(Color.RED);
		String str2="���� ����:"+city.getSelectedItem();
		g.drawString(str2, 30, 150);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChoiceEx2();
	}

}
