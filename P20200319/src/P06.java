
public class P06 {

	public static void main(String[] args) {
	//	A3 a = new A3(); ==> A3�� �����ڸ� private�� �� ��� ������ �ȵȴ�.
		A3.plus(10, 20);
		Math.abs(1);
	//	Math a = new Math(); ==> ���������� Math Ŭ���� ���� �����ڰ� private�� �� �� �ִ�.
	//  System sss = new System; ==> System �� ��������
		
		
	}

}

class A3{
	public A3() {
		
	}
	public static int plus(int a, int b) {
		return a+b;
	}
	
}
