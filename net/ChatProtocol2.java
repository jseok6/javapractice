package net;

public class ChatProtocol2 {
	
	//ID,CHAT,CHATALL,MESSAGE,CHATLIST
	
	//Ŭ���̾�Ʈ->������ ���󰥶�: ID:aaa �̷��������� ����
	//����->Ŭ���̾�Ʈ chatlist: aaa,bbb,ccc,ȫ�浿 �̷�������
	public static final String ID="ID";
	//(C->S)ID:aaa
	//(C->S) CHAT:�޴¾��̵�;�޼��� EX)CHAT:bbb;�����
	//(S->C) CHAT:�����¾��̵�;�޼��� EX) CHAT:AAA;�����
	public static final String CHAT="CHAT";
	
	
	//(C->S)CHATALL:�޼���
	//(S->C)CHATALL:[�����¾��̵�]�޼���
	public static final String CHATALL="CHATALL";
	
	//(c->s)MESSAGE:�޴¾��̵�; ��������EX)MESSAGE:BBB;�����
	//(S->C)MESSAGE:�����¾��̵�;�������� EX)MESSAGE:AAA;�����
	public static final String MESSAGE="MESSAGE";
	
	//(S->C)CHATLIST:AAA;BBB;CCC;ȫ�浿;
	public static final String CHATLIST="CHATLIST";
	
	public static final String MODE=":";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
