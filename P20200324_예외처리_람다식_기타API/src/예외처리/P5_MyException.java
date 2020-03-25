package 예외처리;

public class P5_MyException {
public static void main(String[] args) {
	
	try {
		new Test2().method1(10);
	} catch (MyException e) {
		e.method1();
	}
	}
}
class Test2{
	void method1(int value) throws MyException{
		System.out.println("method1...코드들...");
		System.out.println("method1...코드들...");
		if(value <0) {
			throw new MyException("0보다 작은 값이 들어왔습니다");
		}
		System.out.println("method1...코드들...");
		System.out.println("method1...코드들...");
		System.out.println("method1...코드들...");
		
	}
}

class MyException extends Exception{
	
	public MyException(String message) {
		super(message);
	}
	public void method1() {
		System.out.println("안녕하세요");
	}
}
	