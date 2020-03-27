package 멀티채팅대화방;

import java.util.*;
import java.io.*;
import java.net.*;

public class ChatClient {

	public static void main(String[] args) throws Exception{
	
		Scanner scn = new Scanner(System.in); 
		
		System.out.println("채팅 클라이언트 시작...");
		System.out.println("사용할 닉네임을 입력해 주세요...");
		System.out.print("입력>");
		
		String name = scn.nextLine();
		
		Socket socket = new Socket("211.183.2.91",7755);
		
		DataOutputStream dos = 
				new DataOutputStream(socket.getOutputStream());
		
		dos.writeInt(1);
		dos.writeUTF(name);//접속하자 마자 command == 1 과 name 전달
		
		//...리시브 쓰레드...
		ClientRecvThead rt = new ClientRecvThead();
		rt.socket = socket;
		rt.start();
		
		System.out.println("채팅 서버에 입장 하였습니다.");
		System.out.println("종료는 q를 입력하여주세요");
		
		
		
		while(true) {
			String message = scn.nextLine();
			if(message.equals("q")) {
				socket.close();
				System.out.println("프로그램 종료...");
				break;
			}
			
			dos.writeInt(2);
			dos.writeUTF(message);
						
		}
	}
}


class ClientRecvThead extends Thread{
	//서버에서 값이 날라오면 출력해 주는 역할
	public Socket socket;
	
	@Override
	public void run() {
		
		try {
			DataInputStream dis = 
					new DataInputStream(socket.getInputStream());
			
			while(true) {
				String message = dis.readUTF();
				System.out.println(message);				
			}
			
		}catch(Exception e) {
			//System.out.println("");
		}
		
		
	}
}

