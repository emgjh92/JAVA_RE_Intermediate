package ����ó��;

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
		System.out.println("method1...�ڵ��...");
		System.out.println("method1...�ڵ��...");
		if(value <0) {
			throw new MyException("0���� ���� ���� ���Խ��ϴ�");
		}
		System.out.println("method1...�ڵ��...");
		System.out.println("method1...�ڵ��...");
		System.out.println("method1...�ڵ��...");
		
	}
}

class MyException extends Exception{
	
	public MyException(String message) {
		super(message);
	}
	public void method1() {
		System.out.println("�ȳ��ϼ���");
	}
}
	