package ��Ʈ��ũ���α׷���1;

public class P6_�����嵿��ȭ_����ȭ������ {
	public static void main(String[] args) {
		new Th1().start();
		new Th2().start();
//Theread ����ȭ(thread synchronization)�� ��Ű�� ���� ��� ==> Th1�� Th2�� ������� ����������.
		
	}
}

class Data1{
	public static int count = 0;
	
}

class Th1 extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			Data1.count++;
			System.out.println(Data1.count);
		}
	}
	
}

class Th2 extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			Data1.count++;
			System.out.println(Data1.count);
		}
	}
	
}




