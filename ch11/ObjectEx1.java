package ch11;

import java.lang.*;//����

class Point{}

public class ObjectEx1 {
	public static void main(String[] args) {
		Point p = new Point();
		System.out.println("Ŭ�����̸� : " + p.getClass());
		System.out.println("�ؽ��ڵ� : " + p.hashCode());
		//toString ��������
		System.out.println("��ü���ڿ� : " + p.toString());
		Point p1 = new Point();
		System.out.println("Ŭ�����̸� : " + p1.getClass());
		System.out.println("�ؽ��ڵ� : " + p1.hashCode());
		System.out.println("��ü���ڿ� : " + p1.toString());
		String s = new String("�ݿ���");
		System.out.println("��ü���ڿ� : " + s.toString());
		
		
		
		
	}
}
