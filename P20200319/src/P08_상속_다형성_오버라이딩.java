
public class P08_���_������_�������̵� {
	public static void main(String[] args) {
	//���_������_�������̵� => �������̽�
		B ref = new B(); //���
		ref.v2 = 10;
		 
		A ref1 = new B(); //������
		ref1.v1 = 10;
		//ref1.v2 ==> ���� �Ұ�
		
		ref.method3();//�޼ҵ� �������̵�
		//��� : "B�� �޼ҵ� ȣ��"
	}
}
//====================================================
class A{
	public int v1;
	public void method1() {
		System.out.println("�ȳ��ϼ���");

	}
	
	public void method3() {
		System.out.println("A �� �޼ҵ�");
	}
}

class B extends A{ //B ��� Ŭ������ A�� ��ӹްڴ�.
	public int v2;
	public void method2() {
		System.out.println("�ݰ����ϴ�");
	}
	
	//�������̵� (�޼ҵ� �� ����)
	public void method3() {
		System.out.println("B�� �޼ҵ� ȣ��");
	}
	
}
//=====================================================



