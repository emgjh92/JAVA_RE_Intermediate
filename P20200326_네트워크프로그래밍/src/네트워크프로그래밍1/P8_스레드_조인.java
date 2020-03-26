package 네트워크프로그래밍1;

public class P8_스레드_조인 {
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
		th4.join(); //join API : 각각의 Thread 가 완전히 끝날 때 까지 join 에서 멈춘다.
					// ==> 즉, 각 Thread 가 완전히 계산히 끝난 후에 total을 구할 수 있게 된다.
		
		
		int total = th1.sum + th2.sum + th3.sum + th4.sum;
		System.out.println("1 부터 1000000 까지의 합 : "+ total);
		
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