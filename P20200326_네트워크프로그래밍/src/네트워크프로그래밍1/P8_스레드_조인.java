package ��Ʈ��ũ���α׷���1;

public class P8_������_���� {
	public static void main(String[] args) throws InterruptedException {
		
		SumThread th1 = new SumThread(1,250000);
		SumThread th2 = new SumThread(250001,500000);
		SumThread th3 = new SumThread(500001,750000);
		SumThread th4 = new SumThread(750001,1000000);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
		th1.join();
		th2.join();
		th3.join();
		th4.join(); //join API : ������ Thread �� ������ ���� �� ���� join ���� �����.
					// ==> ��, �� Thread �� ������ ����� ���� �Ŀ� total�� ���� �� �ְ� �ȴ�.
		
		
		int total = th1.sum + th2.sum + th3.sum + th4.sum;
		System.out.println("1 ���� 1000000 ������ �� : "+ total);
		
	}
}


class SumThread extends Thread{
	
	public int sum;
	
	private int start;
	private int end;
	
	public SumThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		
		for(int i = start; i<=end; i++) {
			sum += i;
		}
	}
}