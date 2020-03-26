package ��Ʈ��ũ���α׷���1;

public class P3_��Ƽ������_����1_�����Ȱ�� {
	public static void main(String[] args) throws InterruptedException {
		//����� Ȱ���� ��Ƽ ������
		
		TestThread th1 = new TestThread();
		
		//th1.run();
		th1.start(); //Thread Ŭ���� ������ start ==> �����带 �������� run�� ȣ���Ѵ�.
		//"�ݰ����ϴ�"�� "�ȳ��ϼ���" �� ����� ���� ������� �� �� ����.
		// ������ ���� ��Ų ��� �ΰ��� ���� ���̴� ���� �� �� �ִ�.
		
		for(int i=0; i<100; i++) {
			System.out.println(i+"�ݰ����ϴ�");
			
			Thread.sleep(100); //0.1�� ��
		}
	}
}
class TestThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0; i<100; i++) {
			System.out.println(i+"�ȳ��ϼ���");
			
			try {
				Thread.sleep(300); //�ּ� 0.3�� �̻� ���ڴ� (�� �� ���� �ִ�)
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	/*
	���ü��� ���ļ�

	���ü�(Concurrency) : ��Ƽ �۾��� ���� �ϳ��� �ھ�� ��Ƽ �����尡 ������ ���� �����ϴ� ����
	���ļ�(Parallelism) : ��Ƽ �۾��� ���� ��Ƽ �ھ�� ���� �����带 ���ÿ� �����ϴ� ���� 
	*/
}
