package JAVA_API;

public class P11_ClassforName {
public static void main(String[] args) {
	//class��� �̸��� ���� class
	
	try {
		Class.forName("java.lang.String"); 
		//�ܺο��� �� ���̺귯���� �ִ��� ������ üũ�ϴ� �뵵
		//(���� �ڵ忡�� java.lang.String �� �������� �ε�� �����ϹǷ� Exception�� �߻����� �ʴ´�)
		//Class.forName("oracle.jdbc.DBConnector");
		//�� ���̺귯���� ���� ���� Ȯ�� �����ϴ�.

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	System.out.println("Hello");
}
}
