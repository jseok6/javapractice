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
	String ms[] = {"현 빈","원 빈","이민호","김수현","김우빈","이종석"};
	String fs[] = {"고아라","이연희","이하늬","문채원","수 지","김연아"};
	public ChoiceEx3() {
		
		name=new Choice();
		star=new Choice();
		name.add("남자연예인");
		name.add("여자연예인");
//		for(int i=0; i<ms.length; i++)
//		{
//			star.add(ms[i]);
//		}
		inputItem(star,ms);
		add(name);
		add(star); 
		name.addItemListener(this);
		star.addItemListener(this);
		add(new Label("연예인과 이름을 선택하세요."));
		
	}
	public void inputItem(Choice c, String item[]) {
		c.removeAll();
		for (int i=0; i<item.length; i++)
		{
			c.add(item[i]);
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {//선택됫을때
		// TODO Auto-generated method stub
		if(name.getSelectedItem().equals("남자연예인")) {//단일선택 내용가져오기
			inputItem(star,ms);
		}
		else if(name.getSelectedItem().equals("여자연예인")) {
			inputItem(star,fs);
		}
		
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChoiceEx3();
	}

}
