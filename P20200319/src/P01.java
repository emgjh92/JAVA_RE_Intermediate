
public class P01 {
public static void main(String[] args) {
	
	//java ���������ڿ� this , static ,final ��
	
	final int a = 10; //final : ���� �� �ѹ��� �ʱ�ȭ ����(�� �Ŀ� �� �ٲ�)
	//�ڵ��� �������� ���� ����� "����"�ϴ� ��
	//ex.�¼� �µ��� �ִ� �µ� ��
	
//	a = 20;
//	a = 30; // ������ �Ұ���
	
	System.out.println(a);
	
	
	
	
	int v1 = 10;
	int v2 = 20;
	int result = A1.plus(v1, v2);
	System.out.println(result);
}
}


class A1{
	static int plus(final int a, final int b) {
		//a = 20; ==> final �� ���� �����Ƿ� ������ ������ ����.
		
		return a+b;
	}
}