package ����ó��;

public class P3_Exceptionó��_���� {
	public static void main(String[] args) {
		try{
			int a = 10;
			int b = 20;
			String str = null;
			
			int result = a/b; //Exception 1 �߻�(ArithmeticException)
			
			System.out.println(result);
			System.out.println(str.charAt(0)); //Exception 2 �߻�(NullPointerException)
			
	
			System.out.println("������ �ڵ��...");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException ���� ó�� �ڵ�...");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException ���� ó�� �ڵ�...");
		}catch(Exception e) {
			System.out.println("������ ����ó�� �ڵ�");
			//ArithmeticException , NullPointerException �ܿ� ������ Exception �� ���
		}
		
	}
}
