package net;

public class ChatProtocol2 {
	
	//ID,CHAT,CHATALL,MESSAGE,CHATLIST
	
	//클라이언트->서버로 날라갈때: ID:aaa 이런형식으로 날라감
	//서버->클라이언트 chatlist: aaa,bbb,ccc,홍길동 이런식으로
	public static final String ID="ID";
	//(C->S)ID:aaa
	//(C->S) CHAT:받는아이디;메세지 EX)CHAT:bbb;밥먹자
	//(S->C) CHAT:보내는아이디;메세지 EX) CHAT:AAA;밥먹자
	public static final String CHAT="CHAT";
	
	
	//(C->S)CHATALL:메세지
	//(S->C)CHATALL:[보내는아이디]메세지
	public static final String CHATALL="CHATALL";
	
	//(c->s)MESSAGE:받는아이디; 쪽지내용EX)MESSAGE:BBB;밥먹자
	//(S->C)MESSAGE:보내는아이디;쪽지내용 EX)MESSAGE:AAA;밥먹자
	public static final String MESSAGE="MESSAGE";
	
	//(S->C)CHATLIST:AAA;BBB;CCC;홍길동;
	public static final String CHATLIST="CHATLIST";
	
	public static final String MODE=":";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
