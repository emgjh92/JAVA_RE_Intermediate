package JAVA_API;

public class P9_hashCode {
	public static void main(String[] args) {
		BBB b = new BBB();
		int value = b.hashCode();
		
		System.out.println(value); //����� : 366712642
		System.out.println(b); //����� : JAVA_API.BBB@15db9742
		
		
		String str = "�ȳ��ϼ���";
		System.out.println(str.hashCode()); //����� : 803356551
		
		String str2 = new String("�ȳ��ϼ���");
		System.out.println(str2.hashCode()); //����� : 803356551
		//===> str�� str2 �� Object �ȿ� �ִ� "���ڿ�" ���� ������ hashcode�� �������� �� �� �ִ�.
		//==> �޸� ���� ������ hashcode�� ������ٸ� ���� hashcode�� �޶��� ���̴�.
		
	}
}

class BBB{
	
}