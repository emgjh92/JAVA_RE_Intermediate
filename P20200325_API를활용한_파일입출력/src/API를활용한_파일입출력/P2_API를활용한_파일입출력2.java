package API를활용한_파일입출력;
import java.io.*;

public class P2_API를활용한_파일입출력2 {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\test\\bbb.dat");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		//파일쓰기....코드....로직에 따라 적절히 넣고...
		
		dos.close();
	}
}
