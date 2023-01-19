package event;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventEx2 extends MFrame {
	Label label;
	Checkbox cb1, cb2, cb3;
	public ItemEventEx2() {
		super(300, 200);
		setLayout(new FlowLayout());
		add(cb1=new Checkbox("����"));
		add(cb2=new Checkbox("�ٳ���"));
		add(cb3=new Checkbox("���"));
		add(label = new Label("���� ���� :               "));
		MyItem event=new MyItem(this);
		cb1.addItemListener(event);
		cb2.addItemListener(event);
		cb3.addItemListener(event);
	}
	
	public static void main(String[] args) {
		new ItemEventEx2();
	}
}
//�ܺ� Ŭ�������� �ʿ��� �̺�Ʈ ������ ����(Event2.java ����
class MyItem implements ItemListener{
	ItemEventEx2 x;
	public MyItem(ItemEventEx2 x) {
		// TODO Auto-generated constructor stub
		this.x=x;
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Checkbox cb=(Checkbox)e.getSource();
		String str=cb.getLabel()+":"+cb.getState();
		x.label.setText(str);
	}
	
}




