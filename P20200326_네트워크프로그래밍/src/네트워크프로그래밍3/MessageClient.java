package ��Ʈ��ũ���α׷���3;

import java.util.*;
import java.net.*;
import java.io.*;


public class MessageClient {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost",7777);
		System.out.println("Ŭ��] ����Ǿ���");
		
		RecvThread rt = new RecvThread();
		SendThread st = new SendThread();
		
		rt.socket = socket;
		st.socket = socket;
		
		rt.start();
		st.start();
		
	}

}
