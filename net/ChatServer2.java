package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;


public class ChatServer2 {

	
	public static final int PORT =8002;
	ServerSocket server;
	Vector<ClientThread2> vc;
	
	public ChatServer2() 
	{
		try 
		{
			server=new ServerSocket(PORT);
			vc=new Vector<ClientThread2>();
		} 
		catch (Exception e) 
		{
			System.err.println("Error in Server");
			System.exit(1);//비정상적인 종료
		}
		System.out.println("******************");
		System.out.println("Chat Server v2.0 시작되었습니다");
		System.out.println("******************");
		try {
			while(true)
			{
				Socket sock=server.accept();
				ClientThread2 ct=new ClientThread2(sock);
				ct.start();
				//접속한 클라이언트 Socket 객체를 Vector 저장
				vc.addElement(ct);
			}
		} catch (Exception e) 
		{
//			e.printStackTrace();
			System.err.println("Error in Socket");
		}
	}
	public void sendAllMessage(String msg)
	{
		for (int i = 0; i < vc.size(); i++) {
			ClientThread2 ct=vc.get(i);//벡터에 저장되어있는 클라이언트 가져옴
			ct.sendMessage(msg);//전체에게 메세지 전달
		}
	}
	
	public void removeClient(ClientThread2 ct)
	{
		vc.remove(ct);
	}
	//접속된 모든 id리스트 리턴 ex)aaa;bbb;홍길동;강호동;
	public String getIdList() 
	{
		String list="";
		for (int i=0; i<vc.size(); i++)
		{
			ClientThread2 ct=vc.get(i);
			list+=ct.id+";";
			
		}
		return list;
	}
	//매개변수 id값으로 Client Thread2를 검색하겟다
	public ClientThread2 findClient(String id)
	{
		ClientThread2 ct=null;
		for(int i=0; i<vc.size(); i++)
		{
			ct=vc.get(i);
			if(ct.id.equals(id))//매개변수의 id와 ct의 id가 동일하다면,
				break;
		}
		return ct;
	}
	class ClientThread2 extends Thread
	{
		Socket sock;
		BufferedReader in;
		PrintWriter out;
		String id;
		
		public ClientThread2(Socket sock)
		{
			try 
			{
				this.sock=sock;
				in=new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out=new PrintWriter(sock.getOutputStream(),true);
				//sock.toString
				System.out.println(sock.toString()+"접속됨...");
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		@Override
		public void run() 
		{
			try 
			{
				sendMessage("사용하실 아이디를 입력하세요.");
				while(true)
				{
					String line=in.readLine();
					if(line==null)
					{
						break;
					}
					else
					{
						routine(line);
					}
				}
			} 
			catch (Exception e) 
			{
				removeClient(this);
				System.err.println(sock+"["+id+"]끊어짐...");
			}
		}
		public void routine(String line)
		{
			//CHATALL:오늘은 목요일입니다.
			int idx=line.indexOf(ChatProtocol2.MODE);
			String cmd=line.substring(0,idx);//CHATALL
			String data=line.substring(idx+1);//오늘은 목요일입니다.
			if(cmd.equals(ChatProtocol2.ID))
			{
				id=data;
				//새로운 접속자가 추가되었기 때문에 리스트 재전송
				sendAllMessage(ChatProtocol2.CHATLIST+ChatProtocol2.MODE+getIdList());
				//새로운 접속자 welcome전송
				sendAllMessage(ChatProtocol2.CHATALL+ChatProtocol2.MODE+"["+id+"]님이 입장하였습니다");
			}
			else if(cmd.equals(ChatProtocol2.CHATALL))
			{
				sendAllMessage(ChatProtocol2.CHATALL+ChatProtocol2.MODE+"["+id+"]"+data);
			}
			else if(cmd.equals(ChatProtocol2.CHAT))
			{
				//CHAT:bbb;밥먹자
				idx=data.indexOf(";");
				cmd=data.substring(0,idx);//bbb
				data=data.substring(idx+1);//밥먹자
				//id:bbb를 가진 클라이언트를 검색
				ClientThread2 ct=findClient(cmd);
				if(ct!=null)
				{
					//bbb에게전송
					ct.sendMessage(ChatProtocol2.CHAT+ChatProtocol2.MODE+"["+id+"(S)]"+data);
					//자신에게 전송
					sendMessage(ChatProtocol2.CHAT+ChatProtocol2.MODE+"["+id+"(S)]"+data);
					
					
				}
				else 
				{
					//자신에게 보내는 메세지
					sendMessage(ChatProtocol2.CHAT+ChatProtocol2.MODE+"["+cmd+"]님이 접속자가 아닙니다.");
				}
				
			}
			else if(cmd.equals(ChatProtocol2.MESSAGE))
			{
				//MESSAGE:ccc;오늘 뭐해?
				idx=data.indexOf(";");
				cmd=data.substring(0,idx);//ccc
				data=data.substring(idx+1);//오늘 뭐해?
				ClientThread2 ct= findClient(cmd);
				if(ct!=null)
				{
					ct.sendMessage(ChatProtocol2.MESSAGE+ChatProtocol2.MODE+id+";"+data);
				}
				else
				{
					sendMessage(ChatProtocol2.CHAT+ChatProtocol2.MODE+"["+cmd+"]님이 접속자가 아닙니다.");
				}
				
				
			}
		}
		public void sendMessage(String msg) 
		{
			out.println(msg);
		}
	}
	public static void main(String[] args) {
		new ChatServer2();
//		String str="CHATALL:오늘은 목요일입니다.";
//		int idx=str.indexOf(":");
//		System.out.println(str.substring(0,idx));
//		System.out.println(str.substring(idx+1));

	}

}
