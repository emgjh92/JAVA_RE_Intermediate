package ���ٽ�;

public class P7 {
public static void main(String[] args) {
	
	/*
	Callable x = new Callable() {
		int a = 10;
		public void call() {
			System.out.println("���� ������ �ڵ�...");
			this.a = 20;
		}
	};
	*/
	
	//���ٽ�....
	Callable x = (a, str)->{
		System.out.println("���� ������ �ڵ�");
		System.out.println(a);
		System.out.println(str);
	};
	x.call(10,"aaa");
}	
}

interface Callable{
	public void call(int a, String str);
	
}
//�ȵ���̵� ���α׷��� ��� ���ٽ��� ���� ���̰� �Ѵ�...�ٵ� ������ ���ٸ� ���ٽ��� ���� ���ƾ� �ϸ�,
//���ٽ��� �ڵ��� "������"�� ���ؼ� ���δ�.
/*
class Test3 implements Callable{
	public void call() {
		System.out.println("���� ����~~~~������ �ڵ�");
	}
}
*/