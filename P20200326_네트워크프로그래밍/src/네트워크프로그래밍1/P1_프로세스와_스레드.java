package ��Ʈ��ũ���α׷���1;

public class P1_���μ�����_������ {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println(c);
		
		new Test1().method1();
		
		System.out.println("�ȳ��ϼ���");

	}
}

class Test1{
	public void method1() {
		System.out.println("�޼ҵ� �ڵ��...");
		System.out.println("�޼ҵ� �ڵ��...");
		System.out.println("�޼ҵ� �ڵ��...");
		System.out.println("�޼ҵ� �ڵ��...");
	}
}

/*
 	Process (���μ���) : �������� �ϳ��� ���α׷�, �ϳ��� ���α׷��� ���� ���μ����� ����⵵ �Ѵ�.
	Thread (������) : �ϳ��� ���α׷� ������ �ڵ��� �帧�� �����°�

	Multitasking (��Ƽ �½�ŷ) : �ΰ��� �̻��� �۾��� ���ÿ� ó�� �ϴ� ��
		--> MultiProcess (��Ƽ ���μ���) - ���������� ���α׷����� �����Ű�� �������� �۾� ó��
		--> MultiThread (��Ƽ ������) - �Ѱ��� ���α׷��� �����ϰ� ���������� ���� ���� �۾� ó��
*/
