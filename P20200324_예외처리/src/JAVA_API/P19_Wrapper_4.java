package JAVA_API;

public class P19_Wrapper_4 {
public static void main(String[] args) {
	int a = Integer.parseInt("100");
	System.out.println(a);
	//����� : 100
	String str = "FFD177";
	a = Integer.parseInt(str, 16); //16���� ǥ��
	System.out.println(a);
	//����� : 16765303
	
	int v1 = 1000;
	String bin = Integer.toBinaryString(v1); //���̳ʸ� �ڵ�� ��Ÿ����
	System.out.println(bin); //����� : 1111101000
	}
}
