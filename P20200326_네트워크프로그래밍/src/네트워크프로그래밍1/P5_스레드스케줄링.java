package 네트워크프로그래밍1;

public class P5_스레드스케줄링 {

	public static void main(String[] args) {
		/*
		스레드 스케줄링 : 스레드의 개수가 코어의 수보다 많을 경우
		- 스레드를 어떤 순서로 동시성을 실행할 것인가 결정 => 스레드 스케줄링
		- 스케줄링에 의해 스레드들은 번갈아 가며 run() 메소드를 조금씩 실행
		*/
		
		TestThread5 th5 = new TestThread5();
		th5.start();
		
		TestThread55 th55 = new TestThread55();
		th55.start();
	}

}

class TestThread5 extends Thread{
/*
	자바의 스레드 스케줄링

	- 우선순위(Priority) 방식과 순환할당(Round-Robin)방식 활용
	- 우선순위(Priority) 방식은 코드로 제어가 가능하지만 순환할당(Round-Robin) 방식은 코드로 제어가 불가능 하다
*/
	//우선순위(Priority) 방식 예제
	@Override
	public void run() {
		this.setPriority(1);
		
		for(int i=0; i<100; i++){
			System.out.println(i+"안녕하세요");
		}
		
	}
}

class TestThread55 extends Thread{
	
	@Override
	public void run() {
		this.setPriority(10); //TestThread55 가 더 높은 우선순위를 가진다
		
		for(int i=0; i<100; i++) {
			System.out.println(i+"반갑습니다");
		}
	}
}
