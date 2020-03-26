package 네트워크프로그래밍1;

public class P3_멀티스레드_적용1_상속을활용 {
	public static void main(String[] args) throws InterruptedException {
		//상속을 활용한 멀티 스레드
		
		TestThread th1 = new TestThread();
		
		//th1.run();
		th1.start(); //Thread 클래스 내부의 start ==> 스레드를 생성시켜 run을 호출한다.
		//"반갑습니다"와 "안녕하세요" 중 어느게 먼저 실행될지 알 수 없다.
		// 실제로 실행 시킨 결과 두개의 값이 섞이는 것을 알 수 있다.
		
		for(int i=0; i<100; i++) {
			System.out.println(i+"반갑습니다");
			
			Thread.sleep(100); //0.1초 쉼
		}
	}
}
class TestThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0; i<100; i++) {
			System.out.println(i+"안녕하세요");
			
			try {
				Thread.sleep(300); //최소 0.3초 이상 쉬겠다 (더 될 수도 있다)
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	/*
	동시성과 병렬성

	동시성(Concurrency) : 멀티 작업을 위해 하나의 코어에서 멀티 스레드가 번갈아 가며 실행하는 성질
	병렬성(Parallelism) : 멀티 작업을 위해 멀티 코어에서 개별 스레드를 동시에 실행하는 성질 
	*/
}
