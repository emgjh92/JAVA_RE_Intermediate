
public class Oper {

	public static void main(String[] args) {
		
		int v1 = 10;
		int v2 = 20;
		
		int v3 = v1 + v2;
		//int v3 = v1 - v2;
		//int v3 = v1 * v2;
		//int v3 = v1 / v2;
		v3 = v1%v2;
		
		System.out.println(v3);
		
		v1 = 20; //���� ������
		
		//��, �� ������....����� boolean Ÿ������ ����
		boolean v5 = 10 < 20;
		v5 = v1 > v2;
		v5 = v1 > 200;
		//v5 = v1 > "�ȳ��ϼ���"; ==> ���� �߻�
		v5 = v1 < 10;
		v5 = v1 <= 10;
		v5 = v1 > 10;
		v5 = v1 >= 10;
		v5 = v1 == 10;
		v5 = v1 !=10;
		v5 = !v5;
		v5 = !(v1 > 10); //v1 <= 10
		
		v5 = true && true;
		//v5 = true && 10; //���� (������ type�� ���ƾ� �Ѵ�)
		v5 = v1 > 10 && v2 < 20;
		v5 = true || false; //���� �ϳ��� true �� ��쿣 true
		v5 = v1%2==0 || v1%3==0;
		
		int score=91;
		int attend=70;
		int bongsa=100;
		
		if(attend >=80 && (score >=90 || bongsa==100)) {
			System.out.println("���б� ����� ȹ��...");
		}
		
		//��Ʈ ������...(������!, �ڹٿ��� ���� �Ⱦ�)
		
		
		//���ڿ� ����
		String str = "�ȳ��ϼ���" + "�ݰ����ϴ�"; //���ڿ� + ���ڿ� �� �����ϴ�.
		str = "�ȳ��ϼ���" + (10 + v1);
		
		int bookid=7;
		String bookname = "�౸�� ����";
		String publisher = "�߾�";
		int price =7000;
		
		String query 
		= "INSERT INTO Book VALUES("+bookid+",'"+bookname+"','"+publisher+"',"+price+")";
		System.out.println(query);
		
		
		//�������������
		int v7 = 10;
		//v7 = v7 + 5;
		v7 +=5;
		
		String str2 = "�ȳ��ϼ���";
		str2 += "�ݰ����ϴ�";
		
		int v8 = 10;
		v8++;
		
		
	}

}
