package 멀티채팅대화방;

import java.util.*;
import java.io.*;
import java.net.*;

public class ChatServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("서버]가동 시작...");
		ServerSocket ss = new ServerSocket(7755); 
		
		while(true) { //계속해서 브로드 케스팅
			
			try {
				Socket socket = ss.accept();
				
				DataInputStream dis = 
						new DataInputStream(socket.getInputStream()); 
				
				int command = dis.readInt();
				if(command == 1) {
					String nick= dis.readUTF();
					
					User u = new User(nick,socket);
					DataModel.list.add(u);//static으로 설정한 DataModel에 닉네임과 소켓을 넣어준다.
					
					//greeting
					for(User user : DataModel.list) {
						DataOutputStream dos = 
								new DataOutputStream(user.socket.getOutputStream());
						
						dos.writeUTF(u.name + "님이 입장 하였습니다.");
					}
					
					System.out.println(u.name + "님이 입장 하였습니다.");
					
					ServerRecvThread rt = new ServerRecvThread();
					rt.user = u;
					rt.start();
					
				}
				
				
				
			}catch(Exception e) {
				System.out.println("accept 문제...발생");
			}
			
		}
	}
}

//Data ...
class User{
	public String name;
	public Socket socket;
	
	public User(String name , Socket socket) {
		this.name = name;
		this.socket = socket;
	}
	
}

class DataModel{
	public static ArrayList<User> list = new ArrayList<User>(); 	
	
}

class ServerRecvThread extends Thread{
	
	public User user;
	
	@Override
	public void run() {
		
		try {
			DataInputStream dis = 
					new DataInputStream(user.socket.getInputStream()); 
			while(true) {
				int command = dis.readInt();
				
				if(command == 2) {
					String message = dis.readUTF();
					
					for(User u : DataModel.list) {
						DataOutputStream dos = 
								new DataOutputStream(u.socket.getOutputStream());
						
						dos.writeUTF(user.name + "님 : " + message);
					}
					
					System.out.println(user.name + "님 : " + message);
					
				}else if(command == 3) {
					
					DataModel.list.remove(user);
					
					for(User u : DataModel.list) {
						DataOutputStream dos = 
								new DataOutputStream(u.socket.getOutputStream());
						
						dos.writeUTF(user.name + "님이 퇴장하였습니다.");
						
						System.out.println(user.name + "님이 퇴장하였습니다.");
						break;
					}
					
					
				}
				
			}
			
		}catch(Exception e) {
			//리스트에서 제거....
			DataModel.list.remove(user);
			System.out.println(user.name + "접속 종료..");
		}finally {
			try {
				user.socket.close();
			}catch(Exception e) {
				System.out.println("?????");
			}
		}
		
		
	}
	
}
