
public class P17 {
public static void main(String[] args) {


//  static �� ���� : static���� ���� �Ȱ͵��� ���α׷��� ����ɶ� ���� �޸𸮿� ���´�...
// ==> �޸� ȿ���� �ſ� ��������.
	
//	Test.v2 = 10; //static �� ���� ��
//	static�� ���� �������� �����ǰ� ������ ���� ����������, stack���� �� heap ������ �ƴ� method �����̴�, global �ϰ� ���� �����ϴ�.
	
	System.out.println(Test.v2);
	Test t1 = new Test();
	t1.v1 = 10;
	
	A aa = new A();
	aa.aaaaa(t1);
	
	}
}
class A{
	void aaaaa(Test tt) {
		System.out.println(tt.v1); //����� : 10
		System.out.println(Test.v2);

	}
}
class Test{
	int v1;
	static int v2;
}
