package 네트워크프로그래밍1;

public class P6_스레드동기화_동기화비적용 {
	public static void main(String[] args) {
		new Th1().start();
		new Th2().start();
//Theread 동기화(thread synchronization)를 시키지 않을 경우 ==> Th1과 Th2의 결과값이 꼬여버린다.
		
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




