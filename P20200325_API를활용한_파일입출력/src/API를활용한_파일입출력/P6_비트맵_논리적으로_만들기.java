package API��Ȱ����_���������;

import java.io.*;

public class P6_��Ʈ��_��������_����� {
	public static void main(String[] args) {
		//��Ʈ�� �������� �����
		try {
			
			File file = new File("C:\\test\\aa.bmp");
			
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			dos.writeByte('B');
			dos.writeByte('M');
			
			//dos.writeInt(360054);
			dos.writeByte(360054 >> 0);
			dos.writeByte(360054 >> 8);
			dos.writeByte(360054 >> 16);
			dos.writeByte(360054 >> 24);
			//Little Endian �̹Ƿ� �Ųٷ� �־��ش�.
			
			dos.writeShort(0);
			dos.writeShort(0);

			dos.writeByte(54 >> 0);
			dos.writeByte(54 >> 8);
			dos.writeByte(54 >> 16);
			dos.writeByte(54 >> 24); 
			
			dos.writeByte(40 >> 0); //�� ����� ũ�� (40 ����Ʈ)
			dos.writeByte(40 >> 8);
			dos.writeByte(40 >> 16);
			dos.writeByte(40 >> 24);
			
			dos.writeByte(400 >> 0); //��Ʈ�� ���� (ȭ��)
			dos.writeByte(400 >> 8);
			dos.writeByte(400 >> 16);
			dos.writeByte(400 >> 24);
			
			dos.writeByte(300 >> 0); //��Ʈ�� ���� (ȭ��)
			dos.writeByte(300 >> 8);
			dos.writeByte(300 >> 16);
			dos.writeByte(300 >> 24);
			
			dos.writeByte(1 >> 0);//������ �� (2byte)
			dos.writeByte(1 >> 8);
			
			dos.writeByte(24 >> 0);//�� ȭ�ҿ� ���� ��Ʈ ���̸� �׸��� �� ���̸� ���Ѵ�
			dos.writeByte(24 >> 8);
			
			dos.writeByte(0 >> 0);//���� ���
			dos.writeByte(0 >> 8);
			dos.writeByte(0 >> 16);
			dos.writeByte(0 >> 24);
			
			dos.writeByte(360000 >> 0); //�׸� ũ��
			dos.writeByte(360000 >> 8);
			dos.writeByte(360000 >> 16);
			dos.writeByte(360000 >> 24);

			dos.writeInt(0); //�׸��� ���� �ػ�
			
			dos.writeInt(0); //�׸��� ���� �ػ�
			
			dos.writeInt(0); //�� �ȷ�Ʈ�� �� ��
			
			dos.writeInt(0); //�߿��� ���� ��
			
			
			
			//���� ������....��Ÿ�������ϰ� �� �¾ƾ� ��
			for(int x=0; x<400; x++) {
				for(int y=0; y<300; y++) {
					
					if(x == 20) {
						dos.writeByte(0); //0~255 ���� ��
						dos.writeByte(0); //0~255 ���� ��
						dos.writeByte(255); //0~255 ���� ��
					} else {
						dos.writeByte(x); //0~255 ���� ��
						dos.writeByte(x); //0~255 ���� ��
						dos.writeByte(x); //0~255 ���� ��
					} //===> ���� ���� �׾��� �׶��̼� ��� �׸�����
					
					//dos.writeByte(255); //0~255 ���� ��
					//dos.writeByte(0); //0~255 ���� ��
					//dos.writeByte(0); //0~255 ���� ��
					//==> �Ķ��� ���� ��Ʈ�� ������ ������ �ȴ�. (RGB�� �Ųٷ� �������Ƿ� B->G->R ��)
				}
			}
			//hex ���� ���� : https://ko.wikipedia.org/wiki/BMP_%ED%8C%8C%EC%9D%BC_%ED%8F%AC%EB%A7%B7
			
				
			dos.close();
			
			System.out.println("������ �����Ǿ����ϴ�");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
