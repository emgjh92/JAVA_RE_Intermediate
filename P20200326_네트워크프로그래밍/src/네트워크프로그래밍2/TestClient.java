package ��Ʈ��ũ���α׷���2;

import java.util.*;
import java.net.*;
import java.io.*;

public class TestClient {
	public static void main(String[] args) throws Exception{
		
		Socket socket = new Socket("localhost",1007); //���� ip�ּ�, ��Ʈ��ȣ
		                            //Ȥ�� 127.0.0.1 �� ����
		
		System.out.println("Client] ���� ����");
		
		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		Scanner scn = new Scanner(System.in);
		System.out.print("���ް� �Է�>");
		String value = scn.nextLine();
		
		dos.writeUTF(value);
		
		socket.close();

	}
}
