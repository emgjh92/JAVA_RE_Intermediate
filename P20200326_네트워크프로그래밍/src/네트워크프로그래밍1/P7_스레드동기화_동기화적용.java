package ��Ʈ��ũ���α׷���1;

public class P7_�����嵿��ȭ_����ȭ���� {
	public static void main(String[] args) {
	
		Thread7 th1 = new Thread7();
		th1.setName("1��������");
		Thread7 th2 = new Thread7();
		th2.setName("2��������");
		Thread7 th3 = new Thread7();
		th3.setName("3��������");
		
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
		
		System.out.println("���� �ڵ��...");
		System.out.println("���� �ڵ��...");
//***********************************************************************		
		synchronized(SyncOnject.xxx) {
			Data7.v1++;
			System.out.println(name+Data7.v1);
		}
//***********************************************************************		
	
		//"synchronized" ==> �޼ҵ��� ����ȭ ��ɾ�
		//"synchronized" �� ���� �Ǹ� �ѹ��� �ϳ��� Thread �� ���� �ǰ� �������� �� ������ ���� �Ǵ�
		
		System.out.println("���� �ڵ��...");
		System.out.println("���� �ڵ��...");
	}
}