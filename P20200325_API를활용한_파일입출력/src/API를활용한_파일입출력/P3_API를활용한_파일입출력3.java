package API��Ȱ����_���������;

import java.io.*;

public class P3_API��Ȱ����_���������3 {
	public static void main(String[] args) {
		File file = new File("C:\\test\\ccc.ccc");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			//������ ���� ó��....
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
