
public class P8 {
public static void main(String[] args) {
	String str1 = "�ȳ��ϼ���";
	String str2 = new String("�ȳ��ϼ���");
	
	System.out.println(str1);
	System.out.println(str2);
	
	if(str1 == str2) {
		System.out.println("�� ���� ����.");
	}else {
		System.out.println("�� ���� �ٸ���"); //��� : �� ���� �ٸ���
	}
	/*
	 str2 �� new �� �Ⱦ��� ���� ��� 
	 str1 �� str2�� �ּҰ��� �������� (���� ������ �ּ� �������� ������)
	 ������ ��� ������ ��� (new String()�� �� ���)
	 �ּ� �Ҵ� ��ü�� "���ο� ������ �����ϰ� �ǹǷ�" (new �� ������ �̰Ŵ�)
	 if ������ ���� ���� �ٸ� ���̶�� ��µȴ�.
	 
	 String �� "���� ����" (�޸� �ּҰ��� �����ϴ� ����) �̴�.
	 */
	
	if(str1.equals(str2)) {
		System.out.println("euqals_�� ���� ����.");
	}else {
		System.out.println("equals_�� ���� �ٸ���");
	}//����� : euqals_�� ���� ����.
	
	/*
	 �� ������ �ּҰ� �񱳰� �ƴ϶� ��¥ ��� ���ڿ� ���� ���Ϸ��� 
	 equals ��� api�� ���� �ȴ�.
	 ==> ���ڿ� ���Ҷ��� ������ equals �� ����
	 */
}
}
