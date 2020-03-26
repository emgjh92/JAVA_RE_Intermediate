package 네트워크프로그래밍2;

import java.net.*;
import java.io.*;

public class TestServer {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(1007);
		
		
		System.out.println("Server] 연결을 기다립니다....");
		
		Socket socket = serverSocket.accept();
		
		System.out.println("Server] 누군가 연결되었습니다....");
		
		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		String a = dis.readUTF();
		System.out.println("Server] 전달 받은 값 : " + a);
		
		socket.close();
    }
}
