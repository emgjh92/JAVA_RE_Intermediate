package API��Ȱ����_���������;

import java.io.*;

public class P4_API��Ȱ����_���������4 {
	public static void main(String[] args) throws Exception{
		//���� �б�...
		
		File file = new File("C:\\test\\aaa.dat");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		//�б� ����
		int a = dis.readInt();
		int b = dis.readInt();
		int c = dis.readByte();
		String d = dis.readUTF();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		dis.close();
		
	}
}
