package ��Ʈ��ũ���α׷���1;

public class P4_��Ƽ������_����2_�������̽���Ȱ�� {
	public static void main(String[] args) {
		//�������̽��� Ȱ���� ��Ƽ ������
		
		TestThread2 th2 = new TestThread2();
		new Thread(th2).start();
		
		for(int i=0; i<100; i++) {
			System.out.println(i+"�ݰ����ϴ�");

		}
	}
}
class TestThread2 implements Runnable{
					//extends Thread �� ���� ����
	
	@Override
	public void run() {

		for(int i=0; i<100; i++) {
			System.out.println(i+"�ȳ��ϼ���");
		}
	}

}
