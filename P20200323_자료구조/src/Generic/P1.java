package Generic;

public class P1 {

	public static void main(String[] args) {
		//Generic
		SomeData<Integer, String> data1 = new SomeData<Integer, String>();
		//�޸𸮸� '����'�� �� ��(���� �ƴ�!) ������ type�� �����ϰڴ� ��� ��
		
		SomeData<System, Math> data2 = new SomeData<System, Math>();	
	
	}
}

class SomeData<V, E>{
	
	V soore;
	E name;
	int age;
	//�������� �ڷ����� �� �� ���� ������ �� ���ο� �ڷ����� '����'�� �� �ִ�.
	//���� ���� �������� �ݵ�� type�� �־�� �Ѵ�.
	
	//���� framework �� ���̺귯�� ����(API) �� ���� �� ����.
}