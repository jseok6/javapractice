package AWT;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import event.MFrame;

public class ChoiceEx2 extends MFrame 
implements ItemListener{
	String sair[] = {"대한항공","아시아나","에어부산","진에어"};
	String scity[] = {"서 울","대 전","대 구","부 산","제주도"};
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
		add(new Label("항공사와 도시를 선택하세요"));
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		System.out.println("호출");
		repaint();//결과적으로 paint호출 <ㅡ이거하면 항공사 선택 할때마다 새로 갱신됨
	}
	@Override
	public void paint(Graphics g/*붓*/) {
		// TODO Auto-generated method stub
		if (air==null||city ==null)
		{
			return;//메소드 중간 리턴은 이후에 코드의 무력화
		}
		g.setColor(Color.BLUE);
		String str="항공사 선택:"+air.getSelectedItem();
		g.drawString(str, 30, 120);
		g.setColor(Color.RED);
		String str2="도시 선택:"+city.getSelectedItem();
		g.drawString(str2, 30, 150);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChoiceEx2();
	}

}
