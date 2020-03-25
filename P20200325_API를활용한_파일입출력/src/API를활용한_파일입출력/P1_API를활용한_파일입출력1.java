package API��Ȱ����_���������;
import java.io.*;

public class P1_API��Ȱ����_���������1 {
	public static void main(String[] args) throws IOException {
		//API�� Ȱ���� ���� �����
		
		int a = 400;
		
		File xxx = new File("C:\\test\\aaa.dat");
		
		FileOutputStream fos = new FileOutputStream(xxx);
		//FileOutputStream ==> File write ���
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// a : 00 00 01 90
		//fos.write(a >> 24); // 00 00 00 00
		//fos.write(a >> 16); // 00 00 00 00
		//fos.write(a >> 8);  // 00 00 00 01
		//fos.write(a >> 0);  // 90 00 00 00 
		/*
		 �׳� fos.write(a); �� �� ��� hex editor ���� 90���� ��� (���� hex ���� 190�ε���)
		 
		byte ������ �����ϱ� ������ ������ �Ϻΰ� ©���� ��
		�̸� �ذ��ϱ� ���� >> �� ���� �о��ش�.
		�� �ڵ�ó�� ���� �Ŀ� hex editor �� �� 00 00 01 90 ���� �߰� �ȴ�.
		*/
		
		//�ٸ�, �� ������ �ʹ� ���ŷӰ� ����� ������ ���� API�� "DataOutputStream"
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeInt(10);
		dos.writeInt(400); //4byte �� �ι� ��
	
		dos.writeByte(5); //1byte�� �߰��Ҷ� wirteByte ���
		
		dos.writeUTF("AABBaabb"); //���ڸ� �ְ� ���� �� writeUTF
		
		
		dos.close();//close�� flush �� ���ұ��� ���� �Ѵ�. (flush : ���Ű� �����ִ��� ����)
	
		
		System.out.println("�ȳ��ϼ���");
	}
}
