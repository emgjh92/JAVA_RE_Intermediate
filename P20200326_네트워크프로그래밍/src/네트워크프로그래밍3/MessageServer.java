package ��Ʈ��ũ���α׷���3;

import java.util.*;
import java.net.*;
import java.io.*;

public class MessageServer {
public static void main(String[] args) throws IOException {
	ServerSocket ss = new ServerSocket(7777);
	System.out.println("����] �������� �� ���� ���");
	
	Socket socket = ss.accept();
	
	System.out.println("����] ����Ǿ���...");
	
	RecvThread rt = new RecvThread();
	SendThread st = new SendThread();
	
	rt.socket = socket;
	st.socket = socket;
	
	rt.start();
	st.start();

}
}

class RecvThread extends Thread{
	
	Socket socket;	
	
	public void run() {
		try {
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			while (true) {
				String value = dis.readUTF();
				System.out.println("���� �޼���> "+value);
			}
		} catch (Exception e) {
						
		}
	}
	
}

class SendThread extends Thread{
	
	Socket socket;
	public void run() {
		try {
			Scanner scn = new Scanner(System.in);
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			while(true) {
			System.out.println("�Է� (q=����) > ");
			String value = scn.nextLine();
			
			if(value.equals("q")) {
				break;
				}
			
			dos.writeUTF(value);
			}
			
			socket.close();
			System.out.println("����Ǿ���.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}