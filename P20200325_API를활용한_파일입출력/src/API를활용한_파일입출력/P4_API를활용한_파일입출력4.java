package API를활용한_파일입출력;

import java.io.*;

public class P4_API를활용한_파일입출력4 {
	public static void main(String[] args) throws Exception{
		//파일 읽기...
		
		File file = new File("C:\\test\\aaa.dat");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		//읽기 로직
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
