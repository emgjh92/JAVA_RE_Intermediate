package ��Ʈ��ũ���α׷���2;

import java.net.*;
import java.io.*;

public class TestServer {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(1007);
		
		
		System.out.println("Server] ������ ��ٸ��ϴ�....");
		
		Socket socket = serverSocket.accept();
		
		System.out.println("Server] ������ ����Ǿ����ϴ�....");
		
		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		String a = dis.readUTF();
		System.out.println("Server] ���� ���� �� : " + a);
		
		socket.close();
    }
}
