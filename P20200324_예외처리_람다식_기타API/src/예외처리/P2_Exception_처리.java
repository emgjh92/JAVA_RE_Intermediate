package ����ó��;

public class P2_Exception_ó�� {

	public static void main(String[] args) {
		
		String str1 = "�ȳ��ϼ���";
		System.out.println(str1.charAt(0));
		
		//String str2 = null;
		//System.out.println(str2.charAt(0)); //java.lang.NullPointerException
		
		/*
		int [] arr = new int[30];
		arr[0] = 1;
		arr[10000] = 10; //ArrayIndexOutOfBoundsException: 10000
		*/
		try {
			int [] arr = new int[30];
			arr[0] = 1;
			arr[10000] = 10;
			//�� �������� Exception �߻�
			System.out.println("aaaaa"); //Exception �߻� �� try �� ���� ���� �ڵ���� ������� �ʴ´�. 
		}catch(Exception e){
			System.out.println("���� �߻�");
			return;
		}finally {
			System.out.println("�ȳ��ϼ���"); 
			//finally �� ���� ��ɾ�� �׻� ����ȴ�.
			//catch �� return;�� ������ method (���⼱ main �޼ҵ�)�� ���� �ȴ�.
			//������ finally �� ��� ���� "���Ŀ� ����� �ڵ��..."�� �޸� method �� ���� �Ǵ��� �ݵ�� ����ȴ�.
		}
		
		System.out.println("���Ŀ� ����� �ڵ��....");

		
	}

}
