package AWT;

import java.awt.Canvas;

public class CanvasEx1 extends MFrame {

	Canvas c;
	
	public CanvasEx1() {
		c=new Canvas();
		c.setSize(100,100);
		c.setBackground(MColor.rColor());
		add(c);// �̰� �վ�� ���� ���õȰ� �߰���
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CanvasEx1();
	}

}
