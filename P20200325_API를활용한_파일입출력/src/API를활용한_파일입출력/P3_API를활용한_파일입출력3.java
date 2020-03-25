package API를활용한_파일입출력;

import java.io.*;

public class P3_API를활용한_파일입출력3 {
	public static void main(String[] args) {
		File file = new File("C:\\test\\ccc.ccc");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			//나머지 로직 처리....
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
			fos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
