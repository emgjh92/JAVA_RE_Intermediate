
public class P10_�������̽� {

	public static void main(String[] args) {
		//Xxx ref = null; ==> ����
		//Xxx ref = new Xxx(); ==> �Ұ���
		
		Xxx ref = new AA();
		ref.method();
	}	

}

interface Xxx{ //interface�� ��ӹ޴� �뵵 
	//interface�� �뵵 : ǥ���� ���߰� �����Ѵ�.
	public void method();
	//public abstract void method();
	//�������̽������� abstract �� �⺻���� �ٴ´� (�����ϰ� ��� ������ abstract �̴�)
}

class AA implements Xxx{
	
	//�������̵�
	public void method() {
		System.out.println("�ȳ��ϼ���");
	}
	
}