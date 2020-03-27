package ��Ƽä�ô�ȭ��;

import java.util.*;
import java.io.*;
import java.net.*;

public class ChatServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("����]���� ����...");
		ServerSocket ss = new ServerSocket(7755); 
		
		while(true) { //����ؼ� ��ε� �ɽ���
			
			try {
				Socket socket = ss.accept();
				
				DataInputStream dis = 
						new DataInputStream(socket.getInputStream()); 
				
				int command = dis.readInt();
				if(command == 1) {
					String nick= dis.readUTF();
					
					User u = new User(nick,socket);
					DataModel.list.add(u);//static���� ������ DataModel�� �г��Ӱ� ������ �־��ش�.
					
					//greeting
					for(User user : DataModel.list) {
						DataOutputStream dos = 
								new DataOutputStream(user.socket.getOutputStream());
						
						dos.writeUTF(u.name + "���� ���� �Ͽ����ϴ�.");
					}
					
					System.out.println(u.name + "���� ���� �Ͽ����ϴ�.");
					
					ServerRecvThread rt = new ServerRecvThread();
					rt.user = u;
					rt.start();
					
				}
				
				
				
			}catch(Exception e) {
				System.out.println("accept ����...�߻�");
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
						
						dos.writeUTF(user.name + "�� : " + message);
					}
					
					System.out.println(user.name + "�� : " + message);
					
				}else if(command == 3) {
					
					DataModel.list.remove(user);
					
					for(User u : DataModel.list) {
						DataOutputStream dos = 
								new DataOutputStream(u.socket.getOutputStream());
						
						dos.writeUTF(user.name + "���� �����Ͽ����ϴ�.");
						
						System.out.println(user.name + "���� �����Ͽ����ϴ�.");
						break;
					}
					
					
				}
				
			}
			
		}catch(Exception e) {
			//����Ʈ���� ����....
			DataModel.list.remove(user);
			System.out.println(user.name + "���� ����..");
		}finally {
			try {
				user.socket.close();
			}catch(Exception e) {
				System.out.println("?????");
			}
		}
		
		
	}
	
}
