package ��Ʈ��ũ���α׷���1;

public class P5_�����彺���ٸ� {

	public static void main(String[] args) {
		/*
		������ �����ٸ� : �������� ������ �ھ��� ������ ���� ���
		- �����带 � ������ ���ü��� ������ ���ΰ� ���� => ������ �����ٸ�
		- �����ٸ��� ���� ��������� ������ ���� run() �޼ҵ带 ���ݾ� ����
		*/
		
		TestThread5 th5 = new TestThread5();
		th5.start();
		
		TestThread55 th55 = new TestThread55();
		th55.start();
	}

}

class TestThread5 extends Thread{
/*
	�ڹ��� ������ �����ٸ�

	- �켱����(Priority) ��İ� ��ȯ�Ҵ�(Round-Robin)��� Ȱ��
	- �켱����(Priority) ����� �ڵ�� ��� ���������� ��ȯ�Ҵ�(Round-Robin) ����� �ڵ�� ��� �Ұ��� �ϴ�
*/
	//�켱����(Priority) ��� ����
	@Override
	public void run() {
		this.setPriority(1);
		
		for(int i=0; i<100; i++){
			System.out.println(i+"�ȳ��ϼ���");
		}
		
	}
}

class TestThread55 extends Thread{
	
	@Override
	public void run() {
		this.setPriority(10); //TestThread55 �� �� ���� �켱������ ������
		
		for(int i=0; i<100; i++) {
			System.out.println(i+"�ݰ����ϴ�");
		}
	}
}
