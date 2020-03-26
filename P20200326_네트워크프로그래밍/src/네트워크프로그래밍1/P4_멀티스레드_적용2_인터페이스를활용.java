package 네트워크프로그래밍1;

public class P4_멀티스레드_적용2_인터페이스를활용 {
	public static void main(String[] args) {
		//인터페이스를 활용한 멀티 스레드
		
		TestThread2 th2 = new TestThread2();
		new Thread(th2).start();
		
		for(int i=0; i<100; i++) {
			System.out.println(i+"반갑습니다");

		}
	}
}
class TestThread2 implements Runnable{
					//extends Thread 와 거의 동일
	
	@Override
	public void run() {

		for(int i=0; i<100; i++) {
			System.out.println(i+"안녕하세요");
		}
	}

}
