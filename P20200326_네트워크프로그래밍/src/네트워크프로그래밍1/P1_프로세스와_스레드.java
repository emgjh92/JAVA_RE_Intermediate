package 네트워크프로그래밍1;

public class P1_프로세스와_스레드 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println(c);
		
		new Test1().method1();
		
		System.out.println("안녕하세요");

	}
}

class Test1{
	public void method1() {
		System.out.println("메소드 코드들...");
		System.out.println("메소드 코드들...");
		System.out.println("메소드 코드들...");
		System.out.println("메소드 코드들...");
	}
}

/*
 	Process (프로세스) : 실행중인 하나의 프로그램, 하나의 프로그램이 다중 프로세스를 만들기도 한다.
	Thread (쓰레드) : 하나의 프로그램 내에서 코드의 흐름을 나누는것

	Multitasking (멀티 태스킹) : 두가지 이상의 작업을 동시에 처리 하는 것
		--> MultiProcess (멀티 프로세스) - 독립적으로 프로그램들을 실행시키고 여러가지 작업 처리
		--> MultiThread (멀티 스레드) - 한개의 프로그램을 실행하고 내부적으로 여러 가지 작업 처리
*/
