package 네트워크프로그래밍1;

public class P7_스레드동기화_동기화적용 {
	public static void main(String[] args) {
	
		Thread7 th1 = new Thread7();
		th1.setName("1번스레드");
		Thread7 th2 = new Thread7();
		th2.setName("2번스레드");
		Thread7 th3 = new Thread7();
		th3.setName("3번스레드");
		
		th1.start();
		th2.start();
		th3.start();

	}
}

class Thread7 extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
				Data7.someMethod(this.getName());
		}
	}
}

//***********************************************************************		
class SyncOnject{
	static Object xxx = new Object();
}
//***********************************************************************		

class Data7{
	static int v1;
	
	public static void someMethod(String name) {
	//public static synchronized void someMethod(String name)
		
		System.out.println("실행 코드들...");
		System.out.println("실행 코드들...");
//***********************************************************************		
		synchronized(SyncOnject.xxx) {
			Data7.v1++;
			System.out.println(name+Data7.v1);
		}
//***********************************************************************		
	
		//"synchronized" ==> 메소드의 동기화 명령어
		//"synchronized" 를 쓰게 되면 한번에 하나의 Thread 만 쓰게 되고 나머지는 그 순간에 락을 건다
		
		System.out.println("실행 코드들...");
		System.out.println("실행 코드들...");
	}
}