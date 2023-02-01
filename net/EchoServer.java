package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	
	public static final int PORT=8000;
	
	public EchoServer() {
		// TODO Auto-generated constructor stub
		try {
			int cnt=0;//client 접속개수
			ServerSocket server = new ServerSocket(PORT);
			System.out.println("EchoServer Start......");
			while(true)
			{
				//Client가 접속 할 때 까지 대기 상태
				Socket sock=server.accept();
				EchoThread et=new EchoThread(sock);
				et.start();
				cnt++;
				System.out.println("Client"+cnt+"Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//Client를 대응 관리 하기위한 Thread 상속 내부 클래스 선언
	class EchoThread extends Thread {
		BufferedReader in;
		PrintWriter out;
		Socket sock;
		
		public EchoThread(Socket sock)
		{
			try {
				this.sock=sock;
				in=new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out=new PrintWriter(sock.getOutputStream(),true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			try {
				//Client가 접속하면 처음으로 받는 메세지
				out.println("Hello Enter BYB to exit");//클라이언트에게 프린트하라
				while(true)
				{
					//Client가 메세지 보낼때 까지 대기
					String line=in.readLine();
					if(line==null)//일방적으로 로그아웃 안하고 끊은거
					{
						break;
					}
					else 
					{
						out.println("Echo:"+line);
						if(line.equalsIgnoreCase("BYB"))
						{
							break;
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EchoServer server =new EchoServer();

	}

}
