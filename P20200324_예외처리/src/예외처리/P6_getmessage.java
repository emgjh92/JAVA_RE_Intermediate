package ����ó��;

public class P6_getmessage {
public static void main(String[] args) {
	int a = 10;
	int b = 0;

	try {
		int result = a/b;
		System.out.println(result);
	}catch(Exception  e) {
		//e.printStackTrace();
		String message = e.getMessage();
		System.out.println(message +"�� ������ �߻�");
	}
	System.out.println("�ȳ��ϼ���");
}
}
