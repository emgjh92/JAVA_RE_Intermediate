package 네트워크프로그래밍3;

import java.util.*;
import java.net.*;
import java.io.*;


public class MessageClient {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost",7777);
		System.out.println("클라] 연결되었음");
		
		RecvThread rt = new RecvThread();
		SendThread st = new SendThread();
		
		rt.socket = socket;
		st.socket = socket;
		
		rt.start();
		st.start();
		
	}

}
