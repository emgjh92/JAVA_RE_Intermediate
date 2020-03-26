package 네트워크프로그래밍2;

import java.util.*;
import java.net.*;
import java.io.*;

public class TestClient {
	public static void main(String[] args) throws Exception{
		
		Socket socket = new Socket("localhost",1007); //서버 ip주소, 포트번호
		                            //혹은 127.0.0.1 도 가능
		
		System.out.println("Client] 연결 성공");
		
		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		Scanner scn = new Scanner(System.in);
		System.out.print("전달값 입력>");
		String value = scn.nextLine();
		
		dos.writeUTF(value);
		
		socket.close();

	}
}
